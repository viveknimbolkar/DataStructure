package array.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/find-duplicate-file-in-system/
public class FindDuplicateFile {

    List<List<String>> findDuplicate(String[] paths) {
        // store the content and the file paths of the respective file along with name
        Map<String,List<String>> map = new HashMap<>();

        // create a table of content and filepaths
        for (String path: paths) {
            String[] list = path.split(" ");
            String directory = list[0];

            for (int i = 1; i < list.length; i++) {
                // extract the filename of the file
                String fileName = list[i].substring(0,list[i].indexOf("("));
                // extract the content of the file
                String content = list[i].substring(list[i].indexOf("(")+1,list[i].length()-1);
//                System.out.println(fileName+" "+content);
                // create a sublist of filepaths to add in relation of content
                List<String> filePaths = map.getOrDefault(content,new ArrayList<>());
                // add the file path into the arraylist or sublist
                filePaths.add(directory+"/"+fileName);
                // finally store the mapping of the list
                map.put(content,filePaths);
            }
        }

        // if the file is repeated for the file having same content then remove it and return
        map.entrySet().removeIf(entry -> entry.getValue().size() < 2);
        // a map having the repeated file name at once
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        FindDuplicateFile find = new FindDuplicateFile();
        String[]  paths = {
                "root/a 1.txt(abcd) 2.txt(efgh)",
                "root/c 3.txt(abcd)",
                "root/c/d 4.txt(efgh)",
                "root 4.txt(efgh)"
        };

        System.out.println(find.findDuplicate(paths));

    }
}

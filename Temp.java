class ListNode {
     int val;
     ListNode next;
     ListNode() {}
    ListNode(int val) { this.val = val; }
   ListNode(int val, ListNode next) { this.val = val; this.next = null; }
 }
public class Temp {
    ListNode f,s;
    public static void main(String[] args) {
        ListNode li = new ListNode();
        Temp t = new Temp();
        t.f = new ListNode(10);
        t.f.next = new ListNode(30);
        t.f.next.next = new ListNode(49);


        t.s = new ListNode(56);
        t.s.next = new ListNode(75);
        t.s.next.next = new ListNode(90);

        ListNode l = t.mergeTwoLists(t.f,t.s);

        while (l.next != null) {
            System.out.println(l.val);
            l = l.next;
        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while(true){
            // if list 1 is empty or at least one element
            if(list1 == null){
                tail.next = list2;
                break;
            }


            // if list 2 is empty or at least one element
            if(list2 == null){
                tail.next = list1;
                break;
            }

            if(list1.val <= list2.val){
                tail.next = list1;
                list1 = list1.next;
            }else{
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        return tail.next;
    }
}
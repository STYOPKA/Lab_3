public class Ex4 {
    static Scanner sc;
    public static Node createHead(int count){
        Node head = new Node(sc.nextInt(), null);
        Node ref = head;
        for (int i=1; i<count; i++){
            ref.next = new Node(sc.nextInt(), null);
            ref = ref.next;
        }
        return head;
    }

    public static void printList(Node head) {
        Node ref = head;
        while (ref != null){
            System.out.print(ref.value + " ");
            ref = ref.next;
        }
        System.out.println();
    }

    public static void exOne(Node head){
        int sum = 0;
        int k = 0;
        Node ref = head;
        while (ref != null){
            if(ref.value%3==0){
                sum = sum + ref.value;
                k++;
            }
            ref = ref.next;
        }
        if(k!=0){
            System.out.println("sum " + sum);
            System.out.println("k " + k);
            System.out.println("avg " + (double)sum/k);
        }
        else {
            System.out.println("Нет чисел делящихся на 3");
        }
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("count");
        int count = sc.nextInt();
        System.out.println("Input values");
        Node head = createHead(count);
        printList(head);
        exOne(head);
    }
}

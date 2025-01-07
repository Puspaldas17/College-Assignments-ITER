import java.util.Scanner;
class Node
{
    Node prev;
    int info;
    Node next;
}
    public class DoublyLinkedList
    {
        public static Node head=null;
            public static Node tail=null;
                public static void create(){
                            Scanner sc=new Scanner(System.in);
                            Node p=new Node();
                            System.out.println("Enter the value");
                            p.info=sc.nextInt();
                            p.next=null;
                            p.prev=null;
                            head=tail=p;
                            System.out.println("Add more? (Y/N)");
                            char ch=sc.next().charAt(0);
                            while(ch=='y'||ch=='Y'){
                                Node q=new Node();
                                System.out.println("Enter the value");
                                q.info=sc.nextInt();
                                q.next=null;
                                q.prev=tail;
                                tail.next=q;
                                tail=q;
                                System.out.println("Add more? (Y/N)");
                                ch=sc.next().charAt(0);
                            }
                }
                public static void display(){
                    Node temp=head;
                    System.out.println("Foreward");
                    System.out.print("null------>");
                    while(temp!=null) {
                        System.out.print(temp.info+"------>");
                        temp=temp.next;
                    }
                    System.out.println("null");
                    temp=tail;
                    System.out.println("Backward");
                    System.out.print("null<------");
                    while(temp!=null){
                        System.out.print(temp.info+"<------");
                        temp=temp.prev;
                    }
                    System.out.println("null");
                }
                public static int count(){
                    Node temp=head;
                    int c=0;
                    while(temp!=null){
                        c++;
                        temp=temp.next;
                    }
                    return c;
                }
                public static void insert_beg() {
                    Scanner sc=new Scanner(System.in);
                    Node p=new Node();
                    System.out.println("Enter the value");
                    p.info=sc.nextInt();
                    if(head==null){
                        p.prev=p.next=null;
                        head=tail=p;
                    }
                    p.next=head;
                    p.prev=null;
                    head.prev=p;
                    head=p;
                }
                public static void insert_end(){
                    Scanner sc=new Scanner(System.in);
                    Node p=new Node();
                    System.out.println("Enter the value");
                    p.info=sc.nextInt();
                    if(head==null){
                        p.prev=p.next=null;
                        head=tail=p;
                    }
                    p.prev=tail;
                    p.next=null;
                    tail.next=p;
                    tail=p;
                }
                public static void insert_pos(int pos){
                    Scanner sc=new Scanner(System.in);
                    int count=count();
                    if(pos>=1&&pos<=count+1){
                        if(pos==1)
                            insert_beg();
                        else if(pos==count+1)
                            insert_end();
                        else
                        {
                            int cnt=1;
                            Node temp=head;
                            while(cnt<pos)
                            {
                                cnt=cnt+1;
                                temp=temp.next;
                            }
                            Node p=new Node();
                            System.out.println("Enter the value");
                            p.info=sc.nextInt();
                            p.prev=temp.prev;
                            p.next=temp;
                            temp.prev.next=p;
                            temp.prev=p;
                        }
                    }
                    else {
                        System.out.println("Invalid position");
                    }
                }
                public static void del_beg(){
                    if(head==null) {
                        System.out.println("Underflow");
                        return;
                    }
                    else if(head.next==null)
                        head=tail=null;
                    else  {
                        head=head.next;
                        head.prev=null;
                    }
                }
                public static void del_end(){
                    if(head==null)
                    {
                        System.out.println("Underflow");
                        return;
                    }
                    else if(head.next==null)
                        head=tail=null;
                    else{
                        tail=tail.prev;
                        tail.next=null;
                    }
                }
                public static void del_pos() {
                    Scanner sc = new Scanner(System.in);
                    if (head == null) {
                        System.out.
                                println("Underflow");
                        return;
                    }
                    System.out.println("Enter the position");
                    int pos = sc.nextInt();
                    int count = count();
                    if (pos >= 1 && pos <= count) {
                        if (pos == 1)
                            del_beg();
                        else if (pos == count)
                            del_end();
                        else {
                            int cnt = 1;
                            Node temp = head;
                            while (cnt < pos) {
                                cnt = cnt + 1;
                                temp = temp.next;
                            }
                            temp.prev.next = temp.next;
                            temp.next.prev = temp.prev;
                            temp.next = temp.next = null;
                            temp = null;
                        }
                    } else
                        System.out.println("Invalid position");
                }
                public static void main(String[] args) {
                    Scanner sc=new Scanner (System.in);
                    while(true)
                    {
                        System.out.println("****MENU*****");
                        System.out.println("0:Exit");
                        System.out.println("1:Creation");
                        System.out.println("2:Display");
                        System.out.println("3:Count");
                        System.out.println("4:Insert");
                        System.out.println("5:Delete");
                        System.out.println("*************");
                        System.out.println("Enter the choice");
                        int choice=sc.nextInt();
                        switch(choice)
                        {
                            case 0:
                                System.exit(0);
                                case 1:
                                    create();
                                    break;
                                    case 2:
                                        display();
                                        break;
                                        case 3:
                                            System.out.println("No. of Nodes ="+count());
                                            break;
                                            case 4:
                                                System.out.println("****INSERT*****");
                                                System.out.println("1: Begning");
                                                System.out.println("2: End");
                                                System.out.println("3: Specific Position");
                                                System.out.println("Enter the choice");
                                                int ch=sc.nextInt();
                                                switch(ch)
                                                {
                                                    case 1:
                                                        insert_beg();
                                                        break;
                                                        case 2:
                                                            insert_end();
                                                            break;
                                                            case 3:
                                                                System.out.println("Enter the position");
                                                                int pos=sc.nextInt();
                                                                insert_pos(pos);
                                                                break;
                                                                default:
                                                                    System.out.println("Wrong choice");
                                                                    break;
                                                }
                                                break;
                                                case 5:
                                                    System.out.println("****DELETE*****");
                                                    System.out.println("1: Begning");
                                                    System.out.println("2: End");
                                                    System.out.println("3: Specific Position");
                                                    System.out.println("Enter the choice");
                                                    ch=sc.nextInt();
                                                    switch(ch)
                                                            {
                                                                case 1:
                                                                    del_beg();
                                                                    break;
                                                                    case 2:
                                                                        del_end();
                                                                        break;
                                                                        case 3:
                                                                            del_pos();
                                                                            break;
                                                                            default:
                                                                                System.out.println("Wrong choice");
                                                                                break;
                                                            }
                                                            break;
                                                    default:
                                                        System.out.println("Wrong choice");
                        }
                    }
                }
    }
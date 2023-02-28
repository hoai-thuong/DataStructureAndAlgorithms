package Hw1.exercise5;

public class SimpleLinkedList<T> {
    class Node {
        T data;
        Node next;

        //add constructor
        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

    }

    private Node top = null; //first value/node in list
    private Node bot = null;   //last value/node in list
    private int n = 0;

    // tu them vao
    public SimpleLinkedList() {
        n = 0;
        top = null;
        bot = null;
    }

    public void add(T data) {
        if (top == null) {
            top = new Node(data, null);
            bot = top;
        } else {
            top = new Node(data, top);
        }
        n++;
    }


    public void addBot(T data) {
//        bot.next = new Node(data, bot);
//        bot = bot.next;
        // Create a new node
        Node newNode = new Node(data, null);

        // Check if the list is empty
        if (this.top == null) {
            // Make the new node as head
            this.top = newNode;
        } else {
            Node cur = this.top;
            // traverse to the end of the list
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = newNode;
        }


// Thêm phần tử vào cuối danh sách

    }

    public T get(int i) {
// Lấy phần tử ở vị trí thứ i
        Node list = top;
        for (int k = 0; k < i; k++) {
            list = list.next;
        }
        return list.data;
    }

    // Gán giá trị ở vị trí i bằng data
    public void set(int i, T data) {
        Node list = top;
        for (int k = 0; k < i; k++) {
            list = list.next;
//           data = list.data;
        }
        list.data = data;
    }

    //    public boolean isContain(T data) {
//        Node list = top;
//        int i = 0;
//        while(true) {
//            list = li
//
//        }
//
//// Kiểm tra trong danh sách có chứa phần tử data hay không?
//        return false;
//    }
//
    public int size() {
// Trả lại thông tin số phần tử có trong danh sách
        return n;
    }


    public boolean isEmpty() {
// Kiểm tra danh sách có rỗng hay không?
        if (top == null) {
            return true;
        }
        return false;
    }
//
    public T removeTop() {

// Xóa phần tử ở đầu danh sách, trả lại giá trị data của phần tử đó
        if (top == null) {
            System.out.println("size = " + n);
        }
        T dead = top.data;
        top.data = null;
        top = top.next;
        n--;
        if (top == null) {
            System.out.println("all gone and size = " + n);
        }
        return dead;
    }

    public T removeBot() {
//        T dead = bot.data;
//        bot.data = null;
//        bot = bot.next;
//        n--;
//        return dead;
        Node list = top;
        for (int k = 0; k < n - 1; k++) {
            list = list.next;
        }
        // list is one before value/node to be removed
        T dead = list.next.data;
        list.next.data = null;
        list.next = list.next.next;
        n--;
        return dead;


// Xóa phần tử ở cuối danh sách, trả lại giá trị data của phần tử đó

    }

    //
    public void remove(T data) {
        // Xóa tất cả các phần tử có giá trị bằng data
        Node list = top;
        Node previous = null;
        while (list != null) {
            if (list.data.equals(data)) {
                if (previous == null) {
                    top = top.next;
                    list.data = null;
                } else {
                    previous.next = list.next;
                    list.data = null;
                }
                n--;
//                return true;
            }
            previous = list;
            list = list.next;
        }
//        return false;
    }


    //add to run "main"
    public void display() {
        Node current = top;

        //checking if the head/list is empty

        if (top == null) {

            System.out.println("The given list is empty");

            return;

        }

        //otherwise printing each element in the list

        System.out.println("The data in the doubly linked list are: ");

        while (current != null) {

            //printing each data in the list and next pointer pointing to the next node

            System.out.print(current.data + " ");

            current = current.next;

        }

    }

    //    }
    public static void main(String[] args) {
//        SimpleLinkedList<String> list =

//        LinkedList<String> list = new SimpleLinkedList<String>();
        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.addBot(40);
        list.set(1, 100);
        list.removeTop();
        list.removeBot();
        list.remove(100);
//        list.removeBot();
        list.display();
        System.out.println();
        System.out.println(list.isEmpty());
//        System.out.println(list.get(0));

    }
}
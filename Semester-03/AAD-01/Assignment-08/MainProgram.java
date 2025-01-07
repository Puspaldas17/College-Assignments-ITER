class Node {
    int coeff;
    int pow;
    Node next, prev;

    Node(int coeff, int pow) {
        this.coeff = coeff;
        this.pow = pow;
        this.next = null;
        this.prev = null;
    }
}

class DDL {
    Node head;

    // Insert at the start
    void insertAtStart(int coeff, int pow) {
        Node newNode = new Node(coeff, pow);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Insert at the end
    void insertAtEnd(int coeff, int pow) {
        Node newNode = new Node(coeff, pow);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    // Insert at a given position
    void insertAtPosition(int coeff, int pow, int position) {
        if (position == 1) {
            insertAtStart(coeff, pow);
        } else {
            Node newNode = new Node(coeff, pow);
            Node temp = head;
            for (int i = 1; i < position - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            if (temp.next != null) {
                temp.next.prev = newNode;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    // Delete at the start
    void deleteAtStart() {
        if (head != null) {
            if (head.next == null) {
                head = null;
            } else {
                head = head.next;
                head.prev = null;
            }
        }
    }

    // Delete at the end
    void deleteAtEnd() {
        if (head != null) {
            if (head.next == null) {
                head = null;
            } else {
                Node temp = head;
                while (temp.next.next != null) {
                    temp = temp.next;
                }
                temp.next = null;
            }
        }
    }

    // Delete at a given position
    void deleteAtPosition(int position) {
        if (position == 1) {
            deleteAtStart();
        } else {
            Node temp = head;
            for (int i = 1; i < position - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next != null) {
                temp.next.prev = temp;
            }
        }
    }

    // Print the list
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.coeff + "x^" + temp.pow + " ");
            if (temp.next != null) {
                System.out.print("+ ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}

class PolynomialOps {
    static DDL addPolynomials(DDL poly1, DDL poly2) {
        DDL result = new DDL();
        Node p1 = poly1.head;
        Node p2 = poly2.head;

        while (p1 != null && p2 != null) {
            if (p1.pow == p2.pow) {
                result.insertAtEnd(p1.coeff + p2.coeff, p1.pow);
                p1 = p1.next;
                p2 = p2.next;
            } else if (p1.pow > p2.pow) {
                result.insertAtEnd(p1.coeff, p1.pow);
                p1 = p1.next;
            } else {
                result.insertAtEnd(p2.coeff, p2.pow);
                p2 = p2.next;
            }
        }

        while (p1 != null) {
            result.insertAtEnd(p1.coeff, p1.pow);
            p1 = p1.next;
        }

        while (p2 != null) {
            result.insertAtEnd(p2.coeff, p2.pow);
            p2 = p2.next;
        }

        return result;
    }

    static DDL multiplyPolynomials(DDL poly1, DDL poly2) {
        DDL result = new DDL();
        for (Node p1 = poly1.head; p1 != null; p1 = p1.next) {
            DDL temp = new DDL();
            for (Node p2 = poly2.head; p2 != null; p2 = p2.next) {
                temp.insertAtEnd(p1.coeff * p2.coeff, p1.pow + p2.pow);
            }
            result = addPolynomials(result, temp);
        }

        return result;
    }
}

public class MainProgram {
    public static void main(String[] args) {
        DDL poly1 = new DDL();
        poly1.insertAtEnd(3, 2);  // 3x^2
        poly1.insertAtEnd(5, 1);  // 5x^1
        poly1.insertAtEnd(6, 0);  // 6

        DDL poly2 = new DDL();
        poly2.insertAtEnd(6, 1);  // 6x^1
        poly2.insertAtEnd(8, 0);  // 8

        System.out.print("Polynomial 1: ");
        poly1.printList();
        System.out.print("Polynomial 2: ");
        poly2.printList();

        DDL sum = PolynomialOps.addPolynomials(poly1, poly2);
        System.out.print("Sum: ");
        sum.printList();

        DDL product = PolynomialOps.multiplyPolynomials(poly1, poly2);
        System.out.print("Product: ");
        product.printList();
    }
}

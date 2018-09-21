public class Main {

    public static void main(String[] args) {

        Stack s = new Stack(5);
        s.push(14);
        s.push(34);
        s.push(17);
        s.push(11);
        s.push(99);
        s.print();
        s.shift(2);
        s.print();
        s.shift(3);
        s.print();
        s.pop();
        s.print();
        s.shift(99);
        s.print();
        s.unShift(4);
        s.print();
        s.unShift(7);
        s.print();
    }
    }

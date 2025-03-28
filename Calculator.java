\class addition {
    public int add(int a, int b) {
        int addition = a + b;
        return addition;
    }
}

class subtraction extends addition {
    public int sub(int a, int b) {
        int subtraction = a - b;
        return subtraction;
    }
}

class multiplication extends subtraction {
    public int mul(int a, int b) {
        int multiplication = a * b;
        return multiplication;
    }
}

class division extends multiplication {
    public int div(int a, int b) {
        int division = a / b;
        return division;
    }
}

class calculator {
    public static void main(String args[]) {
        division obj = new division();
        System.out.println(obj.add(4, 8));
        System.out.println(obj.sub(4, 8));
        System.out.println(obj.mul(4, 8));
        System.out.println(obj.div(4, 8));
    }
}
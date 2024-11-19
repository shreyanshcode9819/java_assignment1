class ParameterizedConstructor {
    int value;

    ParameterizedConstructor(int value) {
        this.value = value;
        System.out.println("Parameterized constructor called with value: " + value);
    }

    public static void main(String[] args) {
        ParameterizedConstructor obj = new ParameterizedConstructor(10);
    }
}

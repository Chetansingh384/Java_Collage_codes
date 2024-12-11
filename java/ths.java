class ths{
    void test(){
        System.out.println(this);
    }
    public static void main(String[] args) {
        ths t = new ths();
        System.out.println(t);
        t.test();
    }
}
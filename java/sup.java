class A
{
    int a = 10;
}
class b extends  A{
    int a = 20;
    void show(){
        System.out.println(a);
        System.out.println(super.a);
    }
}
class sup{
    public static void main(String[] args) {
        b r = new b();
        r.show();
    }
}
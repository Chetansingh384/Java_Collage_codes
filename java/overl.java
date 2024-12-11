class A{
    void add()
    {
        int a=10,b=20,c;
        c=a+b;
        System.out.println(c);
    }
    void add(int x,int y)
    {   
        int c;
        c=x+y;
        System.out.println(c);
    }
    public static void main(String[] args) {
        A obj=new A();
        obj.add();
        obj.add(100,200);
    }
}


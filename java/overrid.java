class shape{
    void draw(){
        System.out.println("can not say");
    }
}
class squar extends shape{
    @Override
    void draw(){
        System.out.println("square");
    }
}
class overrid{
    public static void main(String[] args) {
        shape s = new squar();
        s.draw();
}
}
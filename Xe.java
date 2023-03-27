package src.baitapapdung.loptruuttuong.truutuongxemay;

abstract class Xe {
    abstract void brake();
}
class Xemaythethao extends Xe{

    @Override
    public void brake() {
        System.out.println("xemaytheothao: break");
    }
}

class Xemayleonui extends Xe{

    @Override
    public void brake(){
        System.out.println("xemayleonui: break");
    }
}

class Main{
    /**
     * @param args
     */
    public static void main(String[] args){
        final Xe xe = new Xe();
        xe.brake();

        final Xemaythethao xethethao = new Xemaythethao();
        xethethao.break();

        final Xemayleonui xemayleonui = new Xemayleonui();
        xemayleonui.break();
    }
}

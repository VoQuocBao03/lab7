package src.baitapapdung.loptruuttuong.truutuongxemay;

abstract class Xemay {
    abstract void brake();
}
class Xemaythethao extends Xemay{

    @Override
    public void brake() {
        System.out.println("xemaytheothao: break");
    }
}

class Xemayleonui extends Xemay{

    @Override
    public void brake(){
        System.out.println("xemayleonui: break");
    }
}

class Main{
    public static void main(String[] args){
        Xemaythethao xethethao = new Xemaythethao();
        xethethao.brake();

        Xemayleonui xemayleonui = new Xemayleonui();
        xemayleonui.brake();
    }
}


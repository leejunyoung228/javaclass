package ch16.generic;

public class GenericExam {
    public static void main(String[] args) {
        ThreeDPrinterPowder threeDPrinterPowder = new ThreeDPrinterPowder();
        Powder powder = new Powder();
        Plastic plastic = new Plastic();

        threeDPrinterPowder.setMaterial(powder);

        ThreeDPrinterObject threeDPrinterObject = new ThreeDPrinterObject();
        threeDPrinterObject.setMaterial(powder);
        threeDPrinterObject.setMaterial((plastic));

        ThreeDPrinterGeneric<Powder> threeDPrinterGeneric = new ThreeDPrinterGeneric<>();
        threeDPrinterGeneric.setMaterial(powder);
        System.out.println(threeDPrinterGeneric.getMaterial());
    }
}

package c;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Shape s_1 = shapeFactory . getShape (" CIRCLE ", 1.0) ;
        System . out . println (" Circle : " + s_1 . area () ) ;
        s_1 = shapeFactory . getShape (" CIRCLE ", 2.0) ;
        System . out . println (" Circle : " + s_1 . area () ) ;
        s_1 = shapeFactory . getShape (" CIRCLE ", 3.0) ;
        System . out . println (" Circle : " + s_1 . area () ) ;
        s_1 = shapeFactory . getShape (" CIRCLE ", 4.0) ;
        System . out . println (" Circle : " + s_1 . area () ) ;

        /* */
        s_1 = shapeFactory . getShape (" CIRCLE ", 5.0) ;
        System . out . println (" Circle : " + s_1 . area () ) ;
        Shape s_2 = shapeFactory . getShape (" SQUARE ",
        3.0) ;
        System . out . println (" Suare : " + s_2 . area () ) ;
        Shape s_3 = shapeFactory . getShape (" CUBE ",
        3.0) ;
        System . out . println (" Cube : " + s_3 . area () ) ;
    }
}

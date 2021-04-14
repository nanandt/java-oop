class Shape {
    int getCorner(){
        return 0;
    }
}

class Rectangel extends Shape{
    int getCorner(){
        return 4;
    }

    int getParentCorner(){
        return super.getCorner(); // mengakses method parrent nya yg return 0
    }
}

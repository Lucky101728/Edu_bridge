// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
class Rectangle extends Shape {
   double length;
   double breadth;

   Rectangle(double var1, double var3) {
      this.length = var1;
      this.breadth = var3;
   }

   double area() {
      return this.length * this.breadth;
   }
}

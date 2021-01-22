class Main {
  public static void main(String[] args) {
int length = Keyboard.getInt("Please enter the length of the pitch.");

while (length < 90 || length > 120) {
  Screen.display("\n" + "The length is either too short or too big, please enter a length between 90 and 120 metres.", "Error");
  length = Keyboard.getInt("\n" + "Please enter the length of the pitch.");
  } 
  
  int width = Keyboard.getInt("Please enter the width of the pitch.");
  while (width < 45 || width > 90) {
  Screen.display("\n" + "The width of this Pitch is too short or too big, please enter a width between 45 and 90 metres.", "Error");
  width = Keyboard.getInt("\n" + "Please enter the width of the pitch.");
}
  
  double area = length + width;
  if (length > 89 || length < 121 || width > 44 || width < 91) {
  Screen.display("\n" + "The area of this pitch is " + area + "m², This meets the size requirements.", "Football Pitch Size Checker");
  }
}
  }

  

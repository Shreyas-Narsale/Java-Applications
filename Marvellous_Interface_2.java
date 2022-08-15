
//1.one class can extends another class

class Base 
{}


class Derived extends Base{}
/////////////////////////////////////

//2. one class can implemets one interface

interface Demo
{}

class Hello implements Demo
{}

////////////////////////////////////////
//3. one class can implements more than one interface

interface Demo
{}

interface Demo1
{}

class Hello implements Demo,Demo1
{}

///////////////////////////////////////

//4. one interface can extends another interface
interface Base 
{}


interface Derived extends Base
{}

class Marvellous implements Hello
{}
//////////////////////////////////////////
//5.one class can exends one class and implemets one interface
class Demo
{}

interface Hello
{}

 class Marvellous extends Demo implements Hello
 {}

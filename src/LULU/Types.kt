package LULU

//abstract class Type(val name: String, width: Int)
//{
//    var width: Int
//        protected set
//
//    init
//    {
//        this.width = width
//    }
//}
//
//private open class BuiltInType(name: String, width: Int) : Type(name, width)
//
//private val intType = BuiltInType("int", 32)
//private val floatType = BuiltInType("float", 64)
//private val boolType = BuiltInType("bool", 1)
//private val stringType = BuiltInType("StringType", 16)
//enum class BuiltInTypes(val type: BuiltInType)
//{
//    int(intType), float(floatType), bool(boolType), StringType(stringType)
//}
//
//class UserDefinedType(name: String, width: Int = 0) : Type(name, width)
//{
//    operator fun plusAssign(t: Type)
//    {
//        width += t.width
//    }
//}
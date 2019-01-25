// Generated from C:/Users/Mohamadhassan/IdeaProjects/LULUProject/src/LULU\Lulu2.g4 by ANTLR 4.7
package LULU;

import LULU.Lulu2Parser.*;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Lulu2Parser}.
 */
public interface Lulu2Listener extends ParseTreeListener
{
    /**
     * Enter a parse tree produced by {@link Lulu2Parser#main}.
     *
     * @param ctx the parse tree
     */
    void enterMain(MainContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#main}.
     *
     * @param ctx the parse tree
     */
    void exitMain(MainContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#ftDcl}.
     *
     * @param ctx the parse tree
     */
    void enterFtDcl(FtDclContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#ftDcl}.
     *
     * @param ctx the parse tree
     */
    void exitFtDcl(FtDclContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#funcDcl}.
     *
     * @param ctx the parse tree
     */
    void enterFuncDcl(FuncDclContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#funcDcl}.
     *
     * @param ctx the parse tree
     */
    void exitFuncDcl(FuncDclContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#typeBrace}.
     *
     * @param ctx the parse tree
     */
    void enterTypeBrace(TypeBraceContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#typeBrace}.
     *
     * @param ctx the parse tree
     */
    void exitTypeBrace(TypeBraceContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#args}.
     *
     * @param ctx the parse tree
     */
    void enterArgs(ArgsContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#args}.
     *
     * @param ctx the parse tree
     */
    void exitArgs(ArgsContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#argsVar}.
     *
     * @param ctx the parse tree
     */
    void enterArgsVar(ArgsVarContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#argsVar}.
     *
     * @param ctx the parse tree
     */
    void exitArgsVar(ArgsVarContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#typeDcl}.
     *
     * @param ctx the parse tree
     */
    void enterTypeDcl(TypeDclContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#typeDcl}.
     *
     * @param ctx the parse tree
     */
    void exitTypeDcl(TypeDclContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#varDef}.
     *
     * @param ctx the parse tree
     */
    void enterVarDef(VarDefContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#varDef}.
     *
     * @param ctx the parse tree
     */
    void exitVarDef(VarDefContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#varVal}.
     *
     * @param ctx the parse tree
     */
    void enterVarVal(VarValContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#varVal}.
     *
     * @param ctx the parse tree
     */
    void exitVarVal(VarValContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#ftDef}.
     *
     * @param ctx the parse tree
     */
    void enterFtDef(FtDefContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#ftDef}.
     *
     * @param ctx the parse tree
     */
    void exitFtDef(FtDefContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#typeDef}.
     *
     * @param ctx the parse tree
     */
    void enterTypeDef(TypeDefContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#typeDef}.
     *
     * @param ctx the parse tree
     */
    void exitTypeDef(TypeDefContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#component}.
     *
     * @param ctx the parse tree
     */
    void enterComponent(ComponentContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#component}.
     *
     * @param ctx the parse tree
     */
    void exitComponent(ComponentContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#accessModifier}.
     *
     * @param ctx the parse tree
     */
    void enterAccessModifier(AccessModifierContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#accessModifier}.
     *
     * @param ctx the parse tree
     */
    void exitAccessModifier(AccessModifierContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#funcDef}.
     *
     * @param ctx the parse tree
     */
    void enterFuncDef(FuncDefContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#funcDef}.
     *
     * @param ctx the parse tree
     */
    void exitFuncDef(FuncDefContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#block}.
     *
     * @param ctx the parse tree
     */
    void enterBlock(BlockContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#block}.
     *
     * @param ctx the parse tree
     */
    void exitBlock(BlockContext ctx);

    /**
     * Enter a parse tree produced by the {@code ASSIGNAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     */
    void enterASSIGNAlt(ASSIGNAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code ASSIGNAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     */
    void exitASSIGNAlt(ASSIGNAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code FUNCCALLSTMTAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     */
    void enterFUNCCALLSTMTAlt(FUNCCALLSTMTAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code FUNCCALLSTMTAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     */
    void exitFUNCCALLSTMTAlt(FUNCCALLSTMTAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code CONDSTMTAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     */
    void enterCONDSTMTAlt(CONDSTMTAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code CONDSTMTAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     */
    void exitCONDSTMTAlt(CONDSTMTAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code LOOPSTMTAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     */
    void enterLOOPSTMTAlt(LOOPSTMTAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code LOOPSTMTAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     */
    void exitLOOPSTMTAlt(LOOPSTMTAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code RETURNAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     */
    void enterRETURNAlt(RETURNAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code RETURNAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     */
    void exitRETURNAlt(RETURNAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code BREAKAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     */
    void enterBREAKAlt(BREAKAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code BREAKAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     */
    void exitBREAKAlt(BREAKAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code CONTINUEAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     */
    void enterCONTINUEAlt(CONTINUEAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code CONTINUEAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     */
    void exitCONTINUEAlt(CONTINUEAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code DESTRUCTAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     */
    void enterDESTRUCTAlt(DESTRUCTAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code DESTRUCTAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     */
    void exitDESTRUCTAlt(DESTRUCTAltContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#assign}.
     *
     * @param ctx the parse tree
     */
    void enterAssign(AssignContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#assign}.
     *
     * @param ctx the parse tree
     */
    void exitAssign(AssignContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#var}.
     *
     * @param ctx the parse tree
     */
    void enterVar(VarContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#var}.
     *
     * @param ctx the parse tree
     */
    void exitVar(VarContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#ref}.
     *
     * @param ctx the parse tree
     */
    void enterRef(RefContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#ref}.
     *
     * @param ctx the parse tree
     */
    void exitRef(RefContext ctx);

    /**
     * Enter a parse tree produced by the {@code LOGICALANDAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterLOGICALANDAlt(LOGICALANDAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code LOGICALANDAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitLOGICALANDAlt(LOGICALANDAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code BITWISEORAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterBITWISEORAlt(BITWISEORAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code BITWISEORAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitBITWISEORAlt(BITWISEORAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code CONSTVALAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterCONSTVALAlt(CONSTVALAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code CONSTVALAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitCONSTVALAlt(CONSTVALAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code ALLOCATIONAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterALLOCATIONAlt(ALLOCATIONAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code ALLOCATIONAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitALLOCATIONAlt(ALLOCATIONAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code PAREXPRAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterPAREXPRAlt(PAREXPRAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code PAREXPRAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitPAREXPRAlt(PAREXPRAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code ADDSUBAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterADDSUBAlt(ADDSUBAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code ADDSUBAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitADDSUBAlt(ADDSUBAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code LISTAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterLISTAlt(LISTAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code LISTAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitLISTAlt(LISTAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code FUNCCALLAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterFUNCCALLAlt(FUNCCALLAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code FUNCCALLAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitFUNCCALLAlt(FUNCCALLAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code MULDIVAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterMULDIVAlt(MULDIVAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code MULDIVAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitMULDIVAlt(MULDIVAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code EQUALITYAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterEQUALITYAlt(EQUALITYAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code EQUALITYAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitEQUALITYAlt(EQUALITYAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code COMPAREAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterCOMPAREAlt(COMPAREAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code COMPAREAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitCOMPAREAlt(COMPAREAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code LOGICALORAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterLOGICALORAlt(LOGICALORAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code LOGICALORAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitLOGICALORAlt(LOGICALORAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code VARAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterVARAlt(VARAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code VARAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitVARAlt(VARAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code NILAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterNILAlt(NILAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code NILAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitNILAlt(NILAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code BITWISEANDAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterBITWISEANDAlt(BITWISEANDAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code BITWISEANDAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitBITWISEANDAlt(BITWISEANDAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code UNARYOPAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterUNARYOPAlt(UNARYOPAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code UNARYOPAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitUNARYOPAlt(UNARYOPAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code BITWISELOGICALXORAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterBITWISELOGICALXORAlt(BITWISELOGICALXORAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code BITWISELOGICALXORAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitBITWISELOGICALXORAlt(BITWISELOGICALXORAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code METHODCALLAlt}
     * labeled alternative in {@link Lulu2Parser#funcCall}.
     *
     * @param ctx the parse tree
     */
    void enterMETHODCALLAlt(METHODCALLAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code METHODCALLAlt}
     * labeled alternative in {@link Lulu2Parser#funcCall}.
     *
     * @param ctx the parse tree
     */
    void exitMETHODCALLAlt(METHODCALLAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code READAlt}
     * labeled alternative in {@link Lulu2Parser#funcCall}.
     *
     * @param ctx the parse tree
     */
    void enterREADAlt(READAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code READAlt}
     * labeled alternative in {@link Lulu2Parser#funcCall}.
     *
     * @param ctx the parse tree
     */
    void exitREADAlt(READAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code WRITEAlt}
     * labeled alternative in {@link Lulu2Parser#funcCall}.
     *
     * @param ctx the parse tree
     */
    void enterWRITEAlt(WRITEAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code WRITEAlt}
     * labeled alternative in {@link Lulu2Parser#funcCall}.
     *
     * @param ctx the parse tree
     */
    void exitWRITEAlt(WRITEAltContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#list}.
     *
     * @param ctx the parse tree
     */
    void enterList(ListContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#list}.
     *
     * @param ctx the parse tree
     */
    void exitList(ListContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#handleCall}.
     *
     * @param ctx the parse tree
     */
    void enterHandleCall(HandleCallContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#handleCall}.
     *
     * @param ctx the parse tree
     */
    void exitHandleCall(HandleCallContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#params}.
     *
     * @param ctx the parse tree
     */
    void enterParams(ParamsContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#params}.
     *
     * @param ctx the parse tree
     */
    void exitParams(ParamsContext ctx);

    /**
     * Enter a parse tree produced by the {@code IFAlt}
     * labeled alternative in {@link Lulu2Parser#condStmt}.
     *
     * @param ctx the parse tree
     */
    void enterIFAlt(IFAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code IFAlt}
     * labeled alternative in {@link Lulu2Parser#condStmt}.
     *
     * @param ctx the parse tree
     */
    void exitIFAlt(IFAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code SWITCHAlt}
     * labeled alternative in {@link Lulu2Parser#condStmt}.
     *
     * @param ctx the parse tree
     */
    void enterSWITCHAlt(SWITCHAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code SWITCHAlt}
     * labeled alternative in {@link Lulu2Parser#condStmt}.
     *
     * @param ctx the parse tree
     */
    void exitSWITCHAlt(SWITCHAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code FORAlt}
     * labeled alternative in {@link Lulu2Parser#loopStmt}.
     *
     * @param ctx the parse tree
     */
    void enterFORAlt(FORAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code FORAlt}
     * labeled alternative in {@link Lulu2Parser#loopStmt}.
     *
     * @param ctx the parse tree
     */
    void exitFORAlt(FORAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code WHILEAlt}
     * labeled alternative in {@link Lulu2Parser#loopStmt}.
     *
     * @param ctx the parse tree
     */
    void enterWHILEAlt(WHILEAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code WHILEAlt}
     * labeled alternative in {@link Lulu2Parser#loopStmt}.
     *
     * @param ctx the parse tree
     */
    void exitWHILEAlt(WHILEAltContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#type}.
     *
     * @param ctx the parse tree
     */
    void enterType(TypeContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#type}.
     *
     * @param ctx the parse tree
     */
    void exitType(TypeContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#constVal}.
     *
     * @param ctx the parse tree
     */
    void enterConstVal(ConstValContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#constVal}.
     *
     * @param ctx the parse tree
     */
    void exitConstVal(ConstValContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#unaryOp}.
     *
     * @param ctx the parse tree
     */
    void enterUnaryOp(UnaryOpContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#unaryOp}.
     *
     * @param ctx the parse tree
     */
    void exitUnaryOp(UnaryOpContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#firstLevelBinaryArithmeticOp}.
     *
     * @param ctx the parse tree
     */
    void enterFirstLevelBinaryArithmeticOp(FirstLevelBinaryArithmeticOpContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#firstLevelBinaryArithmeticOp}.
     *
     * @param ctx the parse tree
     */
    void exitFirstLevelBinaryArithmeticOp(FirstLevelBinaryArithmeticOpContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#secondLevelBinaryArithmeticOp}.
     *
     * @param ctx the parse tree
     */
    void enterSecondLevelBinaryArithmeticOp(SecondLevelBinaryArithmeticOpContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#secondLevelBinaryArithmeticOp}.
     *
     * @param ctx the parse tree
     */
    void exitSecondLevelBinaryArithmeticOp(SecondLevelBinaryArithmeticOpContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#firstLevelBinaryRelationalOp}.
     *
     * @param ctx the parse tree
     */
    void enterFirstLevelBinaryRelationalOp(FirstLevelBinaryRelationalOpContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#firstLevelBinaryRelationalOp}.
     *
     * @param ctx the parse tree
     */
    void exitFirstLevelBinaryRelationalOp(FirstLevelBinaryRelationalOpContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#secondLevelBinaryRelationalOp}.
     *
     * @param ctx the parse tree
     */
    void enterSecondLevelBinaryRelationalOp(SecondLevelBinaryRelationalOpContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#secondLevelBinaryRelationalOp}.
     *
     * @param ctx the parse tree
     */
    void exitSecondLevelBinaryRelationalOp(SecondLevelBinaryRelationalOpContext ctx);
}
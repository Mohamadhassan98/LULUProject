package LULU;// Generated from C:/Users/Mohamadhassan/IdeaProjects/LULUProject/src\Lulu2.g4 by ANTLR 4.7

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
    void enterMain(Lulu2Parser.MainContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#main}.
     *
     * @param ctx the parse tree
     */
    void exitMain(Lulu2Parser.MainContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#ftDcl}.
     *
     * @param ctx the parse tree
     */
    void enterFtDcl(Lulu2Parser.FtDclContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#ftDcl}.
     *
     * @param ctx the parse tree
     */
    void exitFtDcl(Lulu2Parser.FtDclContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#funcDcl}.
     *
     * @param ctx the parse tree
     */
    void enterFuncDcl(Lulu2Parser.FuncDclContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#funcDcl}.
     *
     * @param ctx the parse tree
     */
    void exitFuncDcl(Lulu2Parser.FuncDclContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#args}.
     *
     * @param ctx the parse tree
     */
    void enterArgs(Lulu2Parser.ArgsContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#args}.
     *
     * @param ctx the parse tree
     */
    void exitArgs(Lulu2Parser.ArgsContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#argsVar}.
     *
     * @param ctx the parse tree
     */
    void enterArgsVar(Lulu2Parser.ArgsVarContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#argsVar}.
     *
     * @param ctx the parse tree
     */
    void exitArgsVar(Lulu2Parser.ArgsVarContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#typeDcl}.
     *
     * @param ctx the parse tree
     */
    void enterTypeDcl(Lulu2Parser.TypeDclContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#typeDcl}.
     *
     * @param ctx the parse tree
     */
    void exitTypeDcl(Lulu2Parser.TypeDclContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#varDef}.
     *
     * @param ctx the parse tree
     */
    void enterVarDef(Lulu2Parser.VarDefContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#varDef}.
     *
     * @param ctx the parse tree
     */
    void exitVarDef(Lulu2Parser.VarDefContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#varVal}.
     *
     * @param ctx the parse tree
     */
    void enterVarVal(Lulu2Parser.VarValContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#varVal}.
     *
     * @param ctx the parse tree
     */
    void exitVarVal(Lulu2Parser.VarValContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#ftDef}.
     *
     * @param ctx the parse tree
     */
    void enterFtDef(Lulu2Parser.FtDefContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#ftDef}.
     *
     * @param ctx the parse tree
     */
    void exitFtDef(Lulu2Parser.FtDefContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#typeDef}.
     *
     * @param ctx the parse tree
     */
    void enterTypeDef(Lulu2Parser.TypeDefContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#typeDef}.
     *
     * @param ctx the parse tree
     */
    void exitTypeDef(Lulu2Parser.TypeDefContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#component}.
     *
     * @param ctx the parse tree
     */
    void enterComponent(Lulu2Parser.ComponentContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#component}.
     *
     * @param ctx the parse tree
     */
    void exitComponent(Lulu2Parser.ComponentContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#accessModifier}.
     *
     * @param ctx the parse tree
     */
    void enterAccessModifier(Lulu2Parser.AccessModifierContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#accessModifier}.
     *
     * @param ctx the parse tree
     */
    void exitAccessModifier(Lulu2Parser.AccessModifierContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#funcDef}.
     *
     * @param ctx the parse tree
     */
    void enterFuncDef(Lulu2Parser.FuncDefContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#funcDef}.
     *
     * @param ctx the parse tree
     */
    void exitFuncDef(Lulu2Parser.FuncDefContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#block}.
     *
     * @param ctx the parse tree
     */
    void enterBlock(Lulu2Parser.BlockContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#block}.
     *
     * @param ctx the parse tree
     */
    void exitBlock(Lulu2Parser.BlockContext ctx);

    /**
     * Enter a parse tree produced by the {@code ASSIGNAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     */
    void enterASSIGNAlt(Lulu2Parser.ASSIGNAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code ASSIGNAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     */
    void exitASSIGNAlt(Lulu2Parser.ASSIGNAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code FUNCCALLSTMTAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     */
    void enterFUNCCALLSTMTAlt(Lulu2Parser.FUNCCALLSTMTAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code FUNCCALLSTMTAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     */
    void exitFUNCCALLSTMTAlt(Lulu2Parser.FUNCCALLSTMTAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code CONDSTMTAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     */
    void enterCONDSTMTAlt(Lulu2Parser.CONDSTMTAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code CONDSTMTAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     */
    void exitCONDSTMTAlt(Lulu2Parser.CONDSTMTAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code LOOPSTMTAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     */
    void enterLOOPSTMTAlt(Lulu2Parser.LOOPSTMTAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code LOOPSTMTAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     */
    void exitLOOPSTMTAlt(Lulu2Parser.LOOPSTMTAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code RETURNAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     */
    void enterRETURNAlt(Lulu2Parser.RETURNAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code RETURNAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     */
    void exitRETURNAlt(Lulu2Parser.RETURNAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code BREAKAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     */
    void enterBREAKAlt(Lulu2Parser.BREAKAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code BREAKAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     */
    void exitBREAKAlt(Lulu2Parser.BREAKAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code CONTINUEAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     */
    void enterCONTINUEAlt(Lulu2Parser.CONTINUEAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code CONTINUEAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     */
    void exitCONTINUEAlt(Lulu2Parser.CONTINUEAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code DESTRUCTAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     */
    void enterDESTRUCTAlt(Lulu2Parser.DESTRUCTAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code DESTRUCTAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     */
    void exitDESTRUCTAlt(Lulu2Parser.DESTRUCTAltContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#assign}.
     *
     * @param ctx the parse tree
     */
    void enterAssign(Lulu2Parser.AssignContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#assign}.
     *
     * @param ctx the parse tree
     */
    void exitAssign(Lulu2Parser.AssignContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#var}.
     *
     * @param ctx the parse tree
     */
    void enterVar(Lulu2Parser.VarContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#var}.
     *
     * @param ctx the parse tree
     */
    void exitVar(Lulu2Parser.VarContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#ref}.
     *
     * @param ctx the parse tree
     */
    void enterRef(Lulu2Parser.RefContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#ref}.
     *
     * @param ctx the parse tree
     */
    void exitRef(Lulu2Parser.RefContext ctx);

    /**
     * Enter a parse tree produced by the {@code LOGICALANDAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterLOGICALANDAlt(Lulu2Parser.LOGICALANDAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code LOGICALANDAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitLOGICALANDAlt(Lulu2Parser.LOGICALANDAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code BITWISEORAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterBITWISEORAlt(Lulu2Parser.BITWISEORAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code BITWISEORAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitBITWISEORAlt(Lulu2Parser.BITWISEORAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code CONSTVALAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterCONSTVALAlt(Lulu2Parser.CONSTVALAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code CONSTVALAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitCONSTVALAlt(Lulu2Parser.CONSTVALAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code ALLOCATIONAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterALLOCATIONAlt(Lulu2Parser.ALLOCATIONAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code ALLOCATIONAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitALLOCATIONAlt(Lulu2Parser.ALLOCATIONAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code PAREXPRAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterPAREXPRAlt(Lulu2Parser.PAREXPRAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code PAREXPRAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitPAREXPRAlt(Lulu2Parser.PAREXPRAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code ADDSUBAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterADDSUBAlt(Lulu2Parser.ADDSUBAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code ADDSUBAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitADDSUBAlt(Lulu2Parser.ADDSUBAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code LISTAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterLISTAlt(Lulu2Parser.LISTAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code LISTAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitLISTAlt(Lulu2Parser.LISTAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code FUNCCALLAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterFUNCCALLAlt(Lulu2Parser.FUNCCALLAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code FUNCCALLAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitFUNCCALLAlt(Lulu2Parser.FUNCCALLAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code MULDIVAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterMULDIVAlt(Lulu2Parser.MULDIVAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code MULDIVAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitMULDIVAlt(Lulu2Parser.MULDIVAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code EQUALITYAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterEQUALITYAlt(Lulu2Parser.EQUALITYAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code EQUALITYAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitEQUALITYAlt(Lulu2Parser.EQUALITYAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code COMPAREAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterCOMPAREAlt(Lulu2Parser.COMPAREAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code COMPAREAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitCOMPAREAlt(Lulu2Parser.COMPAREAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code LOGICALORAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterLOGICALORAlt(Lulu2Parser.LOGICALORAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code LOGICALORAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitLOGICALORAlt(Lulu2Parser.LOGICALORAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code VARAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterVARAlt(Lulu2Parser.VARAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code VARAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitVARAlt(Lulu2Parser.VARAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code NILAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterNILAlt(Lulu2Parser.NILAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code NILAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitNILAlt(Lulu2Parser.NILAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code BITWISEANDAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterBITWISEANDAlt(Lulu2Parser.BITWISEANDAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code BITWISEANDAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitBITWISEANDAlt(Lulu2Parser.BITWISEANDAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code UNARYOPAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterUNARYOPAlt(Lulu2Parser.UNARYOPAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code UNARYOPAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitUNARYOPAlt(Lulu2Parser.UNARYOPAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code BITWISELOGICALXORAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterBITWISELOGICALXORAlt(Lulu2Parser.BITWISELOGICALXORAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code BITWISELOGICALXORAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitBITWISELOGICALXORAlt(Lulu2Parser.BITWISELOGICALXORAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code METHODCALLAlt}
     * labeled alternative in {@link Lulu2Parser#funcCall}.
     *
     * @param ctx the parse tree
     */
    void enterMETHODCALLAlt(Lulu2Parser.METHODCALLAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code METHODCALLAlt}
     * labeled alternative in {@link Lulu2Parser#funcCall}.
     *
     * @param ctx the parse tree
     */
    void exitMETHODCALLAlt(Lulu2Parser.METHODCALLAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code READAlt}
     * labeled alternative in {@link Lulu2Parser#funcCall}.
     *
     * @param ctx the parse tree
     */
    void enterREADAlt(Lulu2Parser.READAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code READAlt}
     * labeled alternative in {@link Lulu2Parser#funcCall}.
     *
     * @param ctx the parse tree
     */
    void exitREADAlt(Lulu2Parser.READAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code WRITEAlt}
     * labeled alternative in {@link Lulu2Parser#funcCall}.
     *
     * @param ctx the parse tree
     */
    void enterWRITEAlt(Lulu2Parser.WRITEAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code WRITEAlt}
     * labeled alternative in {@link Lulu2Parser#funcCall}.
     *
     * @param ctx the parse tree
     */
    void exitWRITEAlt(Lulu2Parser.WRITEAltContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#list}.
     *
     * @param ctx the parse tree
     */
    void enterList(Lulu2Parser.ListContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#list}.
     *
     * @param ctx the parse tree
     */
    void exitList(Lulu2Parser.ListContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#handleCall}.
     *
     * @param ctx the parse tree
     */
    void enterHandleCall(Lulu2Parser.HandleCallContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#handleCall}.
     *
     * @param ctx the parse tree
     */
    void exitHandleCall(Lulu2Parser.HandleCallContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#params}.
     *
     * @param ctx the parse tree
     */
    void enterParams(Lulu2Parser.ParamsContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#params}.
     *
     * @param ctx the parse tree
     */
    void exitParams(Lulu2Parser.ParamsContext ctx);

    /**
     * Enter a parse tree produced by the {@code IFAlt}
     * labeled alternative in {@link Lulu2Parser#condStmt}.
     *
     * @param ctx the parse tree
     */
    void enterIFAlt(Lulu2Parser.IFAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code IFAlt}
     * labeled alternative in {@link Lulu2Parser#condStmt}.
     *
     * @param ctx the parse tree
     */
    void exitIFAlt(Lulu2Parser.IFAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code SWITCHAlt}
     * labeled alternative in {@link Lulu2Parser#condStmt}.
     *
     * @param ctx the parse tree
     */
    void enterSWITCHAlt(Lulu2Parser.SWITCHAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code SWITCHAlt}
     * labeled alternative in {@link Lulu2Parser#condStmt}.
     *
     * @param ctx the parse tree
     */
    void exitSWITCHAlt(Lulu2Parser.SWITCHAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code FORAlt}
     * labeled alternative in {@link Lulu2Parser#loopStmt}.
     *
     * @param ctx the parse tree
     */
    void enterFORAlt(Lulu2Parser.FORAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code FORAlt}
     * labeled alternative in {@link Lulu2Parser#loopStmt}.
     *
     * @param ctx the parse tree
     */
    void exitFORAlt(Lulu2Parser.FORAltContext ctx);

    /**
     * Enter a parse tree produced by the {@code WHILEAlt}
     * labeled alternative in {@link Lulu2Parser#loopStmt}.
     *
     * @param ctx the parse tree
     */
    void enterWHILEAlt(Lulu2Parser.WHILEAltContext ctx);

    /**
     * Exit a parse tree produced by the {@code WHILEAlt}
     * labeled alternative in {@link Lulu2Parser#loopStmt}.
     *
     * @param ctx the parse tree
     */
    void exitWHILEAlt(Lulu2Parser.WHILEAltContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#type}.
     *
     * @param ctx the parse tree
     */
    void enterType(Lulu2Parser.TypeContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#type}.
     *
     * @param ctx the parse tree
     */
    void exitType(Lulu2Parser.TypeContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#constVal}.
     *
     * @param ctx the parse tree
     */
    void enterConstVal(Lulu2Parser.ConstValContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#constVal}.
     *
     * @param ctx the parse tree
     */
    void exitConstVal(Lulu2Parser.ConstValContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#unaryOp}.
     *
     * @param ctx the parse tree
     */
    void enterUnaryOp(Lulu2Parser.UnaryOpContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#unaryOp}.
     *
     * @param ctx the parse tree
     */
    void exitUnaryOp(Lulu2Parser.UnaryOpContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#firstLevelBinaryArithmeticOp}.
     *
     * @param ctx the parse tree
     */
    void enterFirstLevelBinaryArithmeticOp(Lulu2Parser.FirstLevelBinaryArithmeticOpContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#firstLevelBinaryArithmeticOp}.
     *
     * @param ctx the parse tree
     */
    void exitFirstLevelBinaryArithmeticOp(Lulu2Parser.FirstLevelBinaryArithmeticOpContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#secondLevelBinaryArithmeticOp}.
     *
     * @param ctx the parse tree
     */
    void enterSecondLevelBinaryArithmeticOp(Lulu2Parser.SecondLevelBinaryArithmeticOpContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#secondLevelBinaryArithmeticOp}.
     *
     * @param ctx the parse tree
     */
    void exitSecondLevelBinaryArithmeticOp(Lulu2Parser.SecondLevelBinaryArithmeticOpContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#firstLevelBinaryRelationalOp}.
     *
     * @param ctx the parse tree
     */
    void enterFirstLevelBinaryRelationalOp(Lulu2Parser.FirstLevelBinaryRelationalOpContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#firstLevelBinaryRelationalOp}.
     *
     * @param ctx the parse tree
     */
    void exitFirstLevelBinaryRelationalOp(Lulu2Parser.FirstLevelBinaryRelationalOpContext ctx);

    /**
     * Enter a parse tree produced by {@link Lulu2Parser#secondLevelBinaryRelationalOp}.
     *
     * @param ctx the parse tree
     */
    void enterSecondLevelBinaryRelationalOp(Lulu2Parser.SecondLevelBinaryRelationalOpContext ctx);

    /**
     * Exit a parse tree produced by {@link Lulu2Parser#secondLevelBinaryRelationalOp}.
     *
     * @param ctx the parse tree
     */
    void exitSecondLevelBinaryRelationalOp(Lulu2Parser.SecondLevelBinaryRelationalOpContext ctx);
}
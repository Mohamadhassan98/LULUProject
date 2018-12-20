package LULU;// Generated from C:/Users/Mohamadhassan/IdeaProjects/LULUProject/src\Lulu2.g4 by ANTLR 4.7

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Lulu2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface Lulu2Visitor<T> extends ParseTreeVisitor<T>
{
    /**
     * Visit a parse tree produced by {@link Lulu2Parser#main}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMain(Lulu2Parser.MainContext ctx);

    /**
     * Visit a parse tree produced by {@link Lulu2Parser#ftDcl}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFtDcl(Lulu2Parser.FtDclContext ctx);

    /**
     * Visit a parse tree produced by {@link Lulu2Parser#funcDcl}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFuncDcl(Lulu2Parser.FuncDclContext ctx);

    /**
     * Visit a parse tree produced by {@link Lulu2Parser#args}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitArgs(Lulu2Parser.ArgsContext ctx);

    /**
     * Visit a parse tree produced by {@link Lulu2Parser#argsVar}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitArgsVar(Lulu2Parser.ArgsVarContext ctx);

    /**
     * Visit a parse tree produced by {@link Lulu2Parser#typeDcl}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTypeDcl(Lulu2Parser.TypeDclContext ctx);

    /**
     * Visit a parse tree produced by {@link Lulu2Parser#varDef}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVarDef(Lulu2Parser.VarDefContext ctx);

    /**
     * Visit a parse tree produced by {@link Lulu2Parser#varVal}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVarVal(Lulu2Parser.VarValContext ctx);

    /**
     * Visit a parse tree produced by {@link Lulu2Parser#ftDef}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFtDef(Lulu2Parser.FtDefContext ctx);

    /**
     * Visit a parse tree produced by {@link Lulu2Parser#typeDef}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTypeDef(Lulu2Parser.TypeDefContext ctx);

    /**
     * Visit a parse tree produced by {@link Lulu2Parser#component}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitComponent(Lulu2Parser.ComponentContext ctx);

    /**
     * Visit a parse tree produced by {@link Lulu2Parser#accessModifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAccessModifier(Lulu2Parser.AccessModifierContext ctx);

    /**
     * Visit a parse tree produced by {@link Lulu2Parser#funcDef}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFuncDef(Lulu2Parser.FuncDefContext ctx);

    /**
     * Visit a parse tree produced by {@link Lulu2Parser#block}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBlock(Lulu2Parser.BlockContext ctx);

    /**
     * Visit a parse tree produced by the {@code ASSIGNAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitASSIGNAlt(Lulu2Parser.ASSIGNAltContext ctx);

    /**
     * Visit a parse tree produced by the {@code FUNCCALLSTMTAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFUNCCALLSTMTAlt(Lulu2Parser.FUNCCALLSTMTAltContext ctx);

    /**
     * Visit a parse tree produced by the {@code CONDSTMTAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCONDSTMTAlt(Lulu2Parser.CONDSTMTAltContext ctx);

    /**
     * Visit a parse tree produced by the {@code LOOPSTMTAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLOOPSTMTAlt(Lulu2Parser.LOOPSTMTAltContext ctx);

    /**
     * Visit a parse tree produced by the {@code RETURNAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRETURNAlt(Lulu2Parser.RETURNAltContext ctx);

    /**
     * Visit a parse tree produced by the {@code BREAKAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBREAKAlt(Lulu2Parser.BREAKAltContext ctx);

    /**
     * Visit a parse tree produced by the {@code CONTINUEAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCONTINUEAlt(Lulu2Parser.CONTINUEAltContext ctx);

    /**
     * Visit a parse tree produced by the {@code DESTRUCTAlt}
     * labeled alternative in {@link Lulu2Parser#stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDESTRUCTAlt(Lulu2Parser.DESTRUCTAltContext ctx);

    /**
     * Visit a parse tree produced by {@link Lulu2Parser#assign}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAssign(Lulu2Parser.AssignContext ctx);

    /**
     * Visit a parse tree produced by {@link Lulu2Parser#var}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVar(Lulu2Parser.VarContext ctx);

    /**
     * Visit a parse tree produced by {@link Lulu2Parser#ref}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRef(Lulu2Parser.RefContext ctx);

    /**
     * Visit a parse tree produced by the {@code LOGICALANDAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLOGICALANDAlt(Lulu2Parser.LOGICALANDAltContext ctx);

    /**
     * Visit a parse tree produced by the {@code BITWISEORAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBITWISEORAlt(Lulu2Parser.BITWISEORAltContext ctx);

    /**
     * Visit a parse tree produced by the {@code CONSTVALAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCONSTVALAlt(Lulu2Parser.CONSTVALAltContext ctx);

    /**
     * Visit a parse tree produced by the {@code ALLOCATIONAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitALLOCATIONAlt(Lulu2Parser.ALLOCATIONAltContext ctx);

    /**
     * Visit a parse tree produced by the {@code PAREXPRAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPAREXPRAlt(Lulu2Parser.PAREXPRAltContext ctx);

    /**
     * Visit a parse tree produced by the {@code ADDSUBAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitADDSUBAlt(Lulu2Parser.ADDSUBAltContext ctx);

    /**
     * Visit a parse tree produced by the {@code LISTAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLISTAlt(Lulu2Parser.LISTAltContext ctx);

    /**
     * Visit a parse tree produced by the {@code FUNCCALLAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFUNCCALLAlt(Lulu2Parser.FUNCCALLAltContext ctx);

    /**
     * Visit a parse tree produced by the {@code MULDIVAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMULDIVAlt(Lulu2Parser.MULDIVAltContext ctx);

    /**
     * Visit a parse tree produced by the {@code EQUALITYAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitEQUALITYAlt(Lulu2Parser.EQUALITYAltContext ctx);

    /**
     * Visit a parse tree produced by the {@code COMPAREAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCOMPAREAlt(Lulu2Parser.COMPAREAltContext ctx);

    /**
     * Visit a parse tree produced by the {@code LOGICALORAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLOGICALORAlt(Lulu2Parser.LOGICALORAltContext ctx);

    /**
     * Visit a parse tree produced by the {@code VARAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVARAlt(Lulu2Parser.VARAltContext ctx);

    /**
     * Visit a parse tree produced by the {@code NILAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNILAlt(Lulu2Parser.NILAltContext ctx);

    /**
     * Visit a parse tree produced by the {@code BITWISEANDAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBITWISEANDAlt(Lulu2Parser.BITWISEANDAltContext ctx);

    /**
     * Visit a parse tree produced by the {@code UNARYOPAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUNARYOPAlt(Lulu2Parser.UNARYOPAltContext ctx);

    /**
     * Visit a parse tree produced by the {@code BITWISELOGICALXORAlt}
     * labeled alternative in {@link Lulu2Parser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBITWISELOGICALXORAlt(Lulu2Parser.BITWISELOGICALXORAltContext ctx);

    /**
     * Visit a parse tree produced by the {@code METHODCALLAlt}
     * labeled alternative in {@link Lulu2Parser#funcCall}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMETHODCALLAlt(Lulu2Parser.METHODCALLAltContext ctx);

    /**
     * Visit a parse tree produced by the {@code READAlt}
     * labeled alternative in {@link Lulu2Parser#funcCall}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitREADAlt(Lulu2Parser.READAltContext ctx);

    /**
     * Visit a parse tree produced by the {@code WRITEAlt}
     * labeled alternative in {@link Lulu2Parser#funcCall}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWRITEAlt(Lulu2Parser.WRITEAltContext ctx);

    /**
     * Visit a parse tree produced by {@link Lulu2Parser#list}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitList(Lulu2Parser.ListContext ctx);

    /**
     * Visit a parse tree produced by {@link Lulu2Parser#handleCall}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitHandleCall(Lulu2Parser.HandleCallContext ctx);

    /**
     * Visit a parse tree produced by {@link Lulu2Parser#params}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParams(Lulu2Parser.ParamsContext ctx);

    /**
     * Visit a parse tree produced by the {@code IFAlt}
     * labeled alternative in {@link Lulu2Parser#condStmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIFAlt(Lulu2Parser.IFAltContext ctx);

    /**
     * Visit a parse tree produced by the {@code SWITCHAlt}
     * labeled alternative in {@link Lulu2Parser#condStmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSWITCHAlt(Lulu2Parser.SWITCHAltContext ctx);

    /**
     * Visit a parse tree produced by the {@code FORAlt}
     * labeled alternative in {@link Lulu2Parser#loopStmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFORAlt(Lulu2Parser.FORAltContext ctx);

    /**
     * Visit a parse tree produced by the {@code WHILEAlt}
     * labeled alternative in {@link Lulu2Parser#loopStmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWHILEAlt(Lulu2Parser.WHILEAltContext ctx);

    /**
     * Visit a parse tree produced by {@link Lulu2Parser#type}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitType(Lulu2Parser.TypeContext ctx);

    /**
     * Visit a parse tree produced by {@link Lulu2Parser#constVal}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitConstVal(Lulu2Parser.ConstValContext ctx);

    /**
     * Visit a parse tree produced by {@link Lulu2Parser#unaryOp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUnaryOp(Lulu2Parser.UnaryOpContext ctx);

    /**
     * Visit a parse tree produced by {@link Lulu2Parser#firstLevelBinaryArithmeticOp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFirstLevelBinaryArithmeticOp(Lulu2Parser.FirstLevelBinaryArithmeticOpContext ctx);

    /**
     * Visit a parse tree produced by {@link Lulu2Parser#secondLevelBinaryArithmeticOp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSecondLevelBinaryArithmeticOp(Lulu2Parser.SecondLevelBinaryArithmeticOpContext ctx);

    /**
     * Visit a parse tree produced by {@link Lulu2Parser#firstLevelBinaryRelationalOp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFirstLevelBinaryRelationalOp(Lulu2Parser.FirstLevelBinaryRelationalOpContext ctx);

    /**
     * Visit a parse tree produced by {@link Lulu2Parser#secondLevelBinaryRelationalOp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSecondLevelBinaryRelationalOp(Lulu2Parser.SecondLevelBinaryRelationalOpContext ctx);
}
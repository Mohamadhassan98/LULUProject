// Generated from C:/Users/ASC/IdeaProjects/LULUProject/src\Lulu2.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Lulu2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Lulu2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Lulu2Parser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(Lulu2Parser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lulu2Parser#ftDcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFtDcl(Lulu2Parser.FtDclContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lulu2Parser#funcDcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDcl(Lulu2Parser.FuncDclContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lulu2Parser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(Lulu2Parser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lulu2Parser#argsVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgsVar(Lulu2Parser.ArgsVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lulu2Parser#typeDcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDcl(Lulu2Parser.TypeDclContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lulu2Parser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef(Lulu2Parser.VarDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lulu2Parser#varVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarVal(Lulu2Parser.VarValContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lulu2Parser#ftDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFtDef(Lulu2Parser.FtDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lulu2Parser#typeDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDef(Lulu2Parser.TypeDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lulu2Parser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent(Lulu2Parser.ComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lulu2Parser#accessModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessModifier(Lulu2Parser.AccessModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lulu2Parser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(Lulu2Parser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lulu2Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Lulu2Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lulu2Parser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(Lulu2Parser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lulu2Parser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(Lulu2Parser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lulu2Parser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(Lulu2Parser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lulu2Parser#ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef(Lulu2Parser.RefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lulu2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(Lulu2Parser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lulu2Parser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(Lulu2Parser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lulu2Parser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(Lulu2Parser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lulu2Parser#handleCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandleCall(Lulu2Parser.HandleCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lulu2Parser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(Lulu2Parser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lulu2Parser#condStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondStmt(Lulu2Parser.CondStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lulu2Parser#loopStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStmt(Lulu2Parser.LoopStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lulu2Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(Lulu2Parser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lulu2Parser#constVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstVal(Lulu2Parser.ConstValContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lulu2Parser#unaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOp(Lulu2Parser.UnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lulu2Parser#firstLevelBinaryArithmeticOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstLevelBinaryArithmeticOp(Lulu2Parser.FirstLevelBinaryArithmeticOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lulu2Parser#secondLevelBinaryArithmeticOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecondLevelBinaryArithmeticOp(Lulu2Parser.SecondLevelBinaryArithmeticOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lulu2Parser#firstLevelBinaryRelationalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstLevelBinaryRelationalOp(Lulu2Parser.FirstLevelBinaryRelationalOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lulu2Parser#secondLevelBinaryRelationalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecondLevelBinaryRelationalOp(Lulu2Parser.SecondLevelBinaryRelationalOpContext ctx);
}
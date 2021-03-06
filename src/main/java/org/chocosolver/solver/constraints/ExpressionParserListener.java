// Generated from org/chocosolver/solver/constraints/ExpressionParser.g4 by ANTLR 4.0
package org.chocosolver.solver.constraints;

/**
 * Copyright (c) 1999-2014, Ecole des Mines de Nantes
 * All rights reserved.
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the Ecole des Mines de Nantes nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE REGENTS AND CONTRIBUTORS BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

import gnu.trove.list.TIntList;
import gnu.trove.list.array.TIntArrayList;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.exception.SolverException;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.solver.variables.VF;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface ExpressionParserListener extends ParseTreeListener {
	void enterExpression(ExpressionParser.ExpressionContext ctx);
	void exitExpression(ExpressionParser.ExpressionContext ctx);

	void enterAssignment(ExpressionParser.AssignmentContext ctx);
	void exitAssignment(ExpressionParser.AssignmentContext ctx);

	void enterVar(ExpressionParser.VarContext ctx);
	void exitVar(ExpressionParser.VarContext ctx);

	void enterAssgnt(ExpressionParser.AssgntContext ctx);
	void exitAssgnt(ExpressionParser.AssgntContext ctx);

	void enterAtom(ExpressionParser.AtomContext ctx);
	void exitAtom(ExpressionParser.AtomContext ctx);

	void enterShexp(ExpressionParser.ShexpContext ctx);
	void exitShexp(ExpressionParser.ShexpContext ctx);

	void enterOperator(ExpressionParser.OperatorContext ctx);
	void exitOperator(ExpressionParser.OperatorContext ctx);
}
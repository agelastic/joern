package astnodes.expressions;

import astwalking.ASTNodeVisitor;

public class PtrMemberAccess extends PostfixExpression
{
	public void accept(ASTNodeVisitor visitor)
	{
		visitor.visit(this);
	}
}

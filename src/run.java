import java.util.ArrayList;

import org.junit.Assert;

public class run {

    static TokenCollector tc;
    static Assignment parser;
    static SimpleNode s;
    static ArrayList<SimpleNode> formulas;

    public static void main(String args[]) {
	before();
	run r = new run();
	r.acceptsSimpleDisjunction();
	r.acceptsSimpleConjunction();
	r.acceptsSinglePredicate();
	r.acceptsDisjunctionOfPredicateAndConjunction();
	//r.rejectsTwoPredicatesWithoutOperator();
	for (SimpleNode s : formulas) {
	    s.dump("");
	    System.out.println(s.jjtGetNumChildren());
	}

    }

    // @BeforeClass
    public static void before() {
	tc = new TokenCollector();
	parser = new Assignment(tc);
	s = null;
	formulas = new ArrayList<>();
    }

    // @Test
    public void acceptsSinglePredicate() {
	Token pred = new Token();
	pred.image = "P";
	pred.kind = AssignmentConstants.PREDICATE;
	Node predicateP = new SimpleNode(AssignmentTreeConstants.JJTPREDICATE);
	ProducerConsumer.pc.addToken(pred);
	
	addEOF();
	parse();
	s = (SimpleNode) parser.jjtree.rootNode();
	
	Assert.assertTrue((compareAST(predicateP, s)));
	
	
    }

    public void rejectsTwoPredicatesWithoutOperator() {
	Token pred = new Token();
	pred.image = "P";
	pred.kind = AssignmentConstants.PREDICATE;
	ProducerConsumer.pc.addToken(pred);

	Token rhs = new Token();
	rhs.image = "Q";
	rhs.kind = AssignmentConstants.PREDICATE;
	ProducerConsumer.pc.addToken(rhs);

	addEOF();
	parse();
    }

    // @Test
    public void acceptsSimpleDisjunction() {
	Token lhs = new Token();
	lhs.image = "P";
	lhs.kind = AssignmentConstants.PREDICATE;
	ProducerConsumer.pc.addToken(lhs);
	Node predicateP = new SimpleNode(AssignmentTreeConstants.JJTPREDICATE);

	Token or = new Token();
	or.image = "V";
	or.kind = AssignmentConstants.OR;
	ProducerConsumer.pc.addToken(or);
	Node orNode = new SimpleNode(AssignmentTreeConstants.JJTOR);

	Token rhs = new Token();
	rhs.image = "Q";
	rhs.kind = AssignmentConstants.PREDICATE;
	ProducerConsumer.pc.addToken(rhs);
	Node predicateQ = new SimpleNode(AssignmentTreeConstants.JJTPREDICATE);

	addEOF();
	parse();
	s = (SimpleNode) parser.jjtree.rootNode();

	orNode.jjtAddChild(predicateP, 0);
	orNode.jjtAddChild(predicateQ, 1);
	Assert.assertTrue((compareAST(orNode, s)));
	

    }
    
 // @Test
    public void acceptsSimpleConjunction() {
	Token lhs = new Token();
	lhs.image = "P";
	lhs.kind = AssignmentConstants.PREDICATE;
	ProducerConsumer.pc.addToken(lhs);
	Node predicateP = new SimpleNode(AssignmentTreeConstants.JJTPREDICATE);

	Token and = new Token();
	and.image = "^";
	and.kind = AssignmentConstants.AND;
	ProducerConsumer.pc.addToken(and);
	Node andNode = new SimpleNode(AssignmentTreeConstants.JJTAND);

	Token rhs = new Token();
	rhs.image = "Q";
	rhs.kind = AssignmentConstants.PREDICATE;
	ProducerConsumer.pc.addToken(rhs);
	Node predicateQ = new SimpleNode(AssignmentTreeConstants.JJTPREDICATE);

	addEOF();
	parse();
	s = (SimpleNode) parser.jjtree.rootNode();

	andNode.jjtAddChild(predicateP, 0);
	andNode.jjtAddChild(predicateQ, 1);
	Assert.assertTrue((compareAST(andNode, s)));
	

    }

    // @Test
    public void acceptsDisjunctionOfPredicateAndConjunction() {
	Token first = new Token();
	first.image = "P";
	first.kind = AssignmentConstants.PREDICATE;
	ProducerConsumer.pc.addToken(first);
	Node predicateP = new SimpleNode(AssignmentTreeConstants.JJTPREDICATE);

	Token or = new Token();
	or.image = "V";
	or.kind = AssignmentConstants.OR;
	ProducerConsumer.pc.addToken(or);
	Node orNode = new SimpleNode(AssignmentTreeConstants.JJTOR);

	Token second = new Token();
	second.image = "Q";
	second.kind = AssignmentConstants.PREDICATE;
	ProducerConsumer.pc.addToken(second);
	Node predicateQ = new SimpleNode(AssignmentTreeConstants.JJTPREDICATE);

	Token and = new Token();
	and.image = "P";
	and.kind = AssignmentConstants.AND;
	ProducerConsumer.pc.addToken(and);
	Node andNode = new SimpleNode(AssignmentTreeConstants.JJTAND);

	Token third = new Token();
	third.image = "R";
	third.kind = AssignmentConstants.PREDICATE;
	ProducerConsumer.pc.addToken(third);
	Node predicateR = new SimpleNode(AssignmentTreeConstants.JJTPREDICATE);
	
	addEOF();
	parse();
	s = (SimpleNode) parser.jjtree.rootNode();

	andNode.jjtAddChild(orNode, 0);
	  orNode.jjtAddChild(predicateP, 0);
	  orNode.jjtAddChild(predicateQ, 1);
	andNode.jjtAddChild(predicateR, 0);
	
	
	compareAST(s,andNode);

    }

    public static boolean compareAST(Node a, Node b) {
	if (!a.toString().equals(b.toString())) {
	    return false;
	} else if (a.jjtGetNumChildren() != b.jjtGetNumChildren()) {
	    return false;
	}
	int numberOfChildren = a.jjtGetNumChildren();
	for (int i = 0; i < numberOfChildren; i++) {
	    if (!compareAST(a.jjtGetChild(i), b.jjtGetChild(i)))
		return false;
	}
	return true;
    }

    public static void addEOF() {
	Token eof = new Token();
	eof.kind = AssignmentConstants.EOF;
	ProducerConsumer.pc.addToken(eof);
    }

    @SuppressWarnings("static-access")
    public static void parse() {

	try {
	    parser.ReInit(tc);
	    parser.Formula();
	} catch (ParseException e) {
	    e.printStackTrace();
	}
	s = (SimpleNode) parser.jjtree.rootNode();
	formulas.add(s);
	// s.dump("");
    }

}

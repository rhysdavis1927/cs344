/* Generated By:JJTree&JavaCC: Do not edit this line. Assignment.java */
public class Assignment/*@bgen(jjtree)*/implements AssignmentTreeConstants, AssignmentConstants {/*@bgen(jjtree)*/
  protected static JJTAssignmentState jjtree = new JJTAssignmentState();

  static final public void Formula() throws ParseException {
    f2();
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case AND:
      case OR:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case AND:
      ASTAnd jjtn001 = new ASTAnd(JJTAND);
      boolean jjtc001 = true;
      jjtree.openNodeScope(jjtn001);
        try {
          jj_consume_token(AND);
          f2();
        } catch (Throwable jjte001) {
      if (jjtc001) {
        jjtree.clearNodeScope(jjtn001);
        jjtc001 = false;
      } else {
        jjtree.popNode();
      }
      if (jjte001 instanceof RuntimeException) {
        {if (true) throw (RuntimeException)jjte001;}
      }
      if (jjte001 instanceof ParseException) {
        {if (true) throw (ParseException)jjte001;}
      }
      {if (true) throw (Error)jjte001;}
        } finally {
      if (jjtc001) {
        jjtree.closeNodeScope(jjtn001,  2);
      }
        }
        break;
      case OR:
    ASTOr jjtn002 = new ASTOr(JJTOR);
    boolean jjtc002 = true;
    jjtree.openNodeScope(jjtn002);
        try {
          jj_consume_token(OR);
          f2();
        } catch (Throwable jjte002) {
    if (jjtc002) {
      jjtree.clearNodeScope(jjtn002);
      jjtc002 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte002 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte002;}
    }
    if (jjte002 instanceof ParseException) {
      {if (true) throw (ParseException)jjte002;}
    }
    {if (true) throw (Error)jjte002;}
        } finally {
    if (jjtc002) {
      jjtree.closeNodeScope(jjtn002,  2);
    }
        }
        break;
      default:
        jj_la1[1] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    jj_consume_token(0);
  }

  static final public void f2() throws ParseException {
    f3();
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IMPLIES:
      case EQUIVALENT:
        ;
        break;
      default:
        jj_la1[2] = jj_gen;
        break label_2;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IMPLIES:
        jj_consume_token(IMPLIES);
                    ASTImplies jjtn001 = new ASTImplies(JJTIMPLIES);
                    boolean jjtc001 = true;
                    jjtree.openNodeScope(jjtn001);
        try {
          f3();
        } catch (Throwable jjte001) {
                    if (jjtc001) {
                      jjtree.clearNodeScope(jjtn001);
                      jjtc001 = false;
                    } else {
                      jjtree.popNode();
                    }
                    if (jjte001 instanceof RuntimeException) {
                      {if (true) throw (RuntimeException)jjte001;}
                    }
                    if (jjte001 instanceof ParseException) {
                      {if (true) throw (ParseException)jjte001;}
                    }
                    {if (true) throw (Error)jjte001;}
        } finally {
                    if (jjtc001) {
                      jjtree.closeNodeScope(jjtn001,  2);
                    }
        }
        break;
      case EQUIVALENT:
        jj_consume_token(EQUIVALENT);
                     ASTEquivalent jjtn002 = new ASTEquivalent(JJTEQUIVALENT);
                     boolean jjtc002 = true;
                     jjtree.openNodeScope(jjtn002);
        try {
          f3();
        } catch (Throwable jjte002) {
                     if (jjtc002) {
                       jjtree.clearNodeScope(jjtn002);
                       jjtc002 = false;
                     } else {
                       jjtree.popNode();
                     }
                     if (jjte002 instanceof RuntimeException) {
                       {if (true) throw (RuntimeException)jjte002;}
                     }
                     if (jjte002 instanceof ParseException) {
                       {if (true) throw (ParseException)jjte002;}
                     }
                     {if (true) throw (Error)jjte002;}
        } finally {
                     if (jjtc002) {
                       jjtree.closeNodeScope(jjtn002,  2);
                     }
        }
        break;
      default:
        jj_la1[3] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  static final public void f3() throws ParseException {
    ASTPredicate jjtn001 = new ASTPredicate(JJTPREDICATE);
    boolean jjtc001 = true;
    jjtree.openNodeScope(jjtn001);
    try {
      jj_consume_token(PREDICATE);
    } finally {
    if (jjtc001) {
      jjtree.closeNodeScope(jjtn001, true);
    }
    }
  }

  static final public void Predicate() throws ParseException {
 /*@bgen(jjtree) Predicate */
  ASTPredicate jjtn000 = new ASTPredicate(JJTPREDICATE);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(PREDICATE);
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  static private boolean jj_initialized_once = false;
  /** User defined Token Manager. */
  static public TokenManager token_source;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[4];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x6,0x6,0x18,0x18,};
   }


  /** Constructor with user supplied Token Manager. */
  public Assignment(TokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 4; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(TokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 4; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[6];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 4; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 6; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

 }

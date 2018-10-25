/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.surreal.samgen.results.parser;

import org.surreal.samgen.results.lexer.*;
import org.surreal.samgen.results.node.*;
import org.surreal.samgen.results.analysis.*;
import java.util.*;

import java.io.DataInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;

@SuppressWarnings("nls")
public class Parser
{
    public final Analysis ignoredTokens = new AnalysisAdapter();

    protected ArrayList<Object> nodeList;

    private final Lexer lexer;
    private final ListIterator<Object> stack = new LinkedList<Object>().listIterator();
    private int last_pos;
    private int last_line;
    private Token last_token;
    private final TokenIndex converter = new TokenIndex();
    private final int[] action = new int[2];

    private final static int SHIFT = 0;
    private final static int REDUCE = 1;
    private final static int ACCEPT = 2;
    private final static int ERROR = 3;

    public Parser(@SuppressWarnings("hiding") Lexer lexer)
    {
        this.lexer = lexer;
    }

    protected void filter() throws ParserException, LexerException, IOException
    {
        // Empty body
    }

    private void push(int numstate, ArrayList<Object> listNode, boolean hidden) throws ParserException, LexerException, IOException
    {
        this.nodeList = listNode;

        if(!hidden)
        {
            filter();
        }

        if(!this.stack.hasNext())
        {
            this.stack.add(new State(numstate, this.nodeList));
            return;
        }

        State s = (State) this.stack.next();
        s.state = numstate;
        s.nodes = this.nodeList;
    }

    private int goTo(int index)
    {
        int state = state();
        int low = 1;
        int high = gotoTable[index].length - 1;
        int value = gotoTable[index][0][1];

        while(low <= high)
        {
            // int middle = (low + high) / 2;
            int middle = (low + high) >>> 1;

            if(state < gotoTable[index][middle][0])
            {
                high = middle - 1;
            }
            else if(state > gotoTable[index][middle][0])
            {
                low = middle + 1;
            }
            else
            {
                value = gotoTable[index][middle][1];
                break;
            }
        }

        return value;
    }

    private int state()
    {
        State s = (State) this.stack.previous();
        this.stack.next();
        return s.state;
    }

    private ArrayList<Object> pop()
    {
        return ((State) this.stack.previous()).nodes;
    }

    private int index(Switchable token)
    {
        this.converter.index = -1;
        token.apply(this.converter);
        return this.converter.index;
    }

    @SuppressWarnings("unchecked")
    public Start parse() throws ParserException, LexerException, IOException
    {
        push(0, null, true);
        List<Node> ign = null;
        while(true)
        {
            while(index(this.lexer.peek()) == -1)
            {
                if(ign == null)
                {
                    ign = new LinkedList<Node>();
                }

                ign.add(this.lexer.next());
            }

            if(ign != null)
            {
                this.ignoredTokens.setIn(this.lexer.peek(), ign);
                ign = null;
            }

            this.last_pos = this.lexer.peek().getPos();
            this.last_line = this.lexer.peek().getLine();
            this.last_token = this.lexer.peek();

            int index = index(this.lexer.peek());
            this.action[0] = Parser.actionTable[state()][0][1];
            this.action[1] = Parser.actionTable[state()][0][2];

            int low = 1;
            int high = Parser.actionTable[state()].length - 1;

            while(low <= high)
            {
                int middle = (low + high) / 2;

                if(index < Parser.actionTable[state()][middle][0])
                {
                    high = middle - 1;
                }
                else if(index > Parser.actionTable[state()][middle][0])
                {
                    low = middle + 1;
                }
                else
                {
                    this.action[0] = Parser.actionTable[state()][middle][1];
                    this.action[1] = Parser.actionTable[state()][middle][2];
                    break;
                }
            }

            switch(this.action[0])
            {
                case SHIFT:
		    {
		        ArrayList<Object> list = new ArrayList<Object>();
		        list.add(this.lexer.next());
                        push(this.action[1], list, false);
                    }
		    break;
                case REDUCE:
                    {
                        int reduction = this.action[1];
                        if(reduction < 500) reduce_0(reduction);
                    }
                    break;
                case ACCEPT:
                    {
                        EOF node2 = (EOF) this.lexer.next();
                        PResult node1 = (PResult) pop().get(0);
                        Start node = new Start(node1, node2);
                        return node;
                    }
                case ERROR:
                    throw new ParserException(this.last_token,
                        "[" + this.last_line + "," + this.last_pos + "] " +
                        Parser.errorMessages[Parser.errors[this.action[1]]]);
            }
        }
    }

    private void reduce_0(int reduction) throws IOException, LexerException, ParserException
    {
        switch(reduction)
        {
            case 0: /* reduce ANoctrResult */
            {
                ArrayList<Object> list = new0();
                push(goTo(0), list, false);
            }
            break;
            case 1: /* reduce ACtrResult */
            {
                ArrayList<Object> list = new1();
                push(goTo(0), list, false);
            }
            break;
            case 2: /* reduce ABmcResult */
            {
                ArrayList<Object> list = new2();
                push(goTo(0), list, false);
            }
            break;
            case 3: /* reduce ASimpleTNoBmcIndexRow */
            {
                ArrayList<Object> list = new3();
                push(goTo(1), list, false);
            }
            break;
            case 4: /* reduce ASimpleTfrow */
            {
                ArrayList<Object> list = new4();
                push(goTo(2), list, false);
            }
            break;
            case 5: /* reduce ASimpleFfrow */
            {
                ArrayList<Object> list = new5();
                push(goTo(3), list, false);
            }
            break;
            case 6: /* reduce ASimpleFbrow */
            {
                ArrayList<Object> list = new6();
                push(goTo(4), list, false);
            }
            break;
            case 7: /* reduce ASimpleBody */
            {
                ArrayList<Object> list = new7();
                push(goTo(5), list, false);
            }
            break;
            case 8: /* reduce AConcatBody */
            {
                ArrayList<Object> list = new8();
                push(goTo(5), list, false);
            }
            break;
            case 9: /* reduce AHeaderStatebody */
            {
                ArrayList<Object> list = new9();
                push(goTo(6), list, false);
            }
            break;
            case 10: /* reduce AHeaderStateheader */
            {
                ArrayList<Object> list = new10();
                push(goTo(7), list, false);
            }
            break;
            case 11: /* reduce ASimpleSteps */
            {
                ArrayList<Object> list = new11();
                push(goTo(8), list, false);
            }
            break;
            case 12: /* reduce AConcatSteps */
            {
                ArrayList<Object> list = new12();
                push(goTo(8), list, false);
            }
            break;
            case 13: /* reduce AEventStep */
            {
                ArrayList<Object> list = new13();
                push(goTo(9), list, false);
            }
            break;
            case 14: /* reduce AIndexStep */
            {
                ArrayList<Object> list = new14();
                push(goTo(9), list, false);
            }
            break;
            case 15: /* reduce ANumValue */
            {
                ArrayList<Object> list = new15();
                push(goTo(10), list, false);
            }
            break;
            case 16: /* reduce AStrValue */
            {
                ArrayList<Object> list = new16();
                push(goTo(10), list, false);
            }
            break;
            case 17: /* reduce AIdLabel */
            {
                ArrayList<Object> list = new17();
                push(goTo(11), list, false);
            }
            break;
            case 18: /* reduce AIdGlobalname */
            {
                ArrayList<Object> list = new18();
                push(goTo(12), list, false);
            }
            break;
            case 19: /* reduce AIdProcess */
            {
                ArrayList<Object> list = new19();
                push(goTo(13), list, false);
            }
            break;
            case 20: /* reduce AIdIndex */
            {
                ArrayList<Object> list = new20();
                push(goTo(14), list, false);
            }
            break;
            case 21: /* reduce ANumNrval */
            {
                ArrayList<Object> list = new21();
                push(goTo(15), list, false);
            }
            break;
            case 22: /* reduce AIdCrval */
            {
                ArrayList<Object> list = new22();
                push(goTo(16), list, false);
            }
            break;
            case 23: /* reduce ANumFid */
            {
                ArrayList<Object> list = new23();
                push(goTo(17), list, false);
            }
            break;
            case 24: /* reduce ANumSid */
            {
                ArrayList<Object> list = new24();
                push(goTo(18), list, false);
            }
            break;
            case 25: /* reduce AIdSrcmode */
            {
                ArrayList<Object> list = new25();
                push(goTo(19), list, false);
            }
            break;
            case 26: /* reduce AIdTrgmode */
            {
                ArrayList<Object> list = new26();
                push(goTo(20), list, false);
            }
            break;
            case 27: /* reduce ANumBound */
            {
                ArrayList<Object> list = new27();
                push(goTo(21), list, false);
            }
            break;
        }
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new0() /* reduce ANoctrResult */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PResult presultNode1;
        {
            // Block
        PTfrow ptfrowNode2;
        ptfrowNode2 = (PTfrow)nodeArrayList1.get(0);

        presultNode1 = new ANoctrResult(ptfrowNode2);
        }
	nodeList.add(presultNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new1() /* reduce ACtrResult */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList5 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList4 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList3 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PResult presultNode1;
        {
            // Block
        PFfrow pffrowNode2;
        TTokSrow ttoksrowNode3;
        TTokTrow ttoktrowNode4;
        TTokHrow ttokhrowNode5;
        PBody pbodyNode6;
        pffrowNode2 = (PFfrow)nodeArrayList1.get(0);
        ttoksrowNode3 = (TTokSrow)nodeArrayList2.get(0);
        ttoktrowNode4 = (TTokTrow)nodeArrayList3.get(0);
        ttokhrowNode5 = (TTokHrow)nodeArrayList4.get(0);
        pbodyNode6 = (PBody)nodeArrayList5.get(0);

        presultNode1 = new ACtrResult(pffrowNode2, ttoksrowNode3, ttoktrowNode4, ttokhrowNode5, pbodyNode6);
        }
	nodeList.add(presultNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new2() /* reduce ABmcResult */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList5 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList4 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList3 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PResult presultNode1;
        {
            // Block
        PFbrow pfbrowNode2;
        TTokSrow ttoksrowNode3;
        TTokBmcTrow ttokbmctrowNode4;
        TTokHrow ttokhrowNode5;
        PBody pbodyNode6;
        pfbrowNode2 = (PFbrow)nodeArrayList1.get(0);
        ttoksrowNode3 = (TTokSrow)nodeArrayList2.get(0);
        ttokbmctrowNode4 = (TTokBmcTrow)nodeArrayList3.get(0);
        ttokhrowNode5 = (TTokHrow)nodeArrayList4.get(0);
        pbodyNode6 = (PBody)nodeArrayList5.get(0);

        presultNode1 = new ABmcResult(pfbrowNode2, ttoksrowNode3, ttokbmctrowNode4, ttokhrowNode5, pbodyNode6);
        }
	nodeList.add(presultNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new3() /* reduce ASimpleTNoBmcIndexRow */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PTNoBmcIndexRow ptnobmcindexrowNode1;
        {
            // Block
        TTkNoBound ttknoboundNode2;
        PBound pboundNode3;
        ttknoboundNode2 = (TTkNoBound)nodeArrayList1.get(0);
        pboundNode3 = (PBound)nodeArrayList2.get(0);

        ptnobmcindexrowNode1 = new ASimpleTNoBmcIndexRow(ttknoboundNode2, pboundNode3);
        }
	nodeList.add(ptnobmcindexrowNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new4() /* reduce ASimpleTfrow */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList6 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList5 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList4 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList3 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PTfrow ptfrowNode1;
        {
            // Block
        TTokFrowLeft ttokfrowleftNode2;
        PSrcmode psrcmodeNode3;
        TTokFrowMiddle ttokfrowmiddleNode4;
        PTrgmode ptrgmodeNode5;
        TTokFrowRight ttokfrowrightNode6;
        TBoolTrue tbooltrueNode7;
        ttokfrowleftNode2 = (TTokFrowLeft)nodeArrayList1.get(0);
        psrcmodeNode3 = (PSrcmode)nodeArrayList2.get(0);
        ttokfrowmiddleNode4 = (TTokFrowMiddle)nodeArrayList3.get(0);
        ptrgmodeNode5 = (PTrgmode)nodeArrayList4.get(0);
        ttokfrowrightNode6 = (TTokFrowRight)nodeArrayList5.get(0);
        tbooltrueNode7 = (TBoolTrue)nodeArrayList6.get(0);

        ptfrowNode1 = new ASimpleTfrow(ttokfrowleftNode2, psrcmodeNode3, ttokfrowmiddleNode4, ptrgmodeNode5, ttokfrowrightNode6, tbooltrueNode7);
        }
	nodeList.add(ptfrowNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new5() /* reduce ASimpleFfrow */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList6 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList5 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList4 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList3 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PFfrow pffrowNode1;
        {
            // Block
        TTokFrowLeft ttokfrowleftNode2;
        PSrcmode psrcmodeNode3;
        TTokFrowMiddle ttokfrowmiddleNode4;
        PTrgmode ptrgmodeNode5;
        TTokFrowRight ttokfrowrightNode6;
        TBoolFalse tboolfalseNode7;
        ttokfrowleftNode2 = (TTokFrowLeft)nodeArrayList1.get(0);
        psrcmodeNode3 = (PSrcmode)nodeArrayList2.get(0);
        ttokfrowmiddleNode4 = (TTokFrowMiddle)nodeArrayList3.get(0);
        ptrgmodeNode5 = (PTrgmode)nodeArrayList4.get(0);
        ttokfrowrightNode6 = (TTokFrowRight)nodeArrayList5.get(0);
        tboolfalseNode7 = (TBoolFalse)nodeArrayList6.get(0);

        pffrowNode1 = new ASimpleFfrow(ttokfrowleftNode2, psrcmodeNode3, ttokfrowmiddleNode4, ptrgmodeNode5, ttokfrowrightNode6, tboolfalseNode7);
        }
	nodeList.add(pffrowNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new6() /* reduce ASimpleFbrow */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList6 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList5 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList4 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList3 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PFbrow pfbrowNode1;
        {
            // Block
        TTokFrowBmcLeft ttokfrowbmcleftNode2;
        PSrcmode psrcmodeNode3;
        TTokFrowBmcMiddle ttokfrowbmcmiddleNode4;
        PTrgmode ptrgmodeNode5;
        TTokFrowRight ttokfrowrightNode6;
        TBoolFalse tboolfalseNode7;
        ttokfrowbmcleftNode2 = (TTokFrowBmcLeft)nodeArrayList1.get(0);
        psrcmodeNode3 = (PSrcmode)nodeArrayList2.get(0);
        ttokfrowbmcmiddleNode4 = (TTokFrowBmcMiddle)nodeArrayList3.get(0);
        ptrgmodeNode5 = (PTrgmode)nodeArrayList4.get(0);
        ttokfrowrightNode6 = (TTokFrowRight)nodeArrayList5.get(0);
        tboolfalseNode7 = (TBoolFalse)nodeArrayList6.get(0);

        pfbrowNode1 = new ASimpleFbrow(ttokfrowbmcleftNode2, psrcmodeNode3, ttokfrowbmcmiddleNode4, ptrgmodeNode5, ttokfrowrightNode6, tboolfalseNode7);
        }
	nodeList.add(pfbrowNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new7() /* reduce ASimpleBody */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PBody pbodyNode1;
        {
            // Block
        PStatebody pstatebodyNode2;
        pstatebodyNode2 = (PStatebody)nodeArrayList1.get(0);

        pbodyNode1 = new ASimpleBody(pstatebodyNode2);
        }
	nodeList.add(pbodyNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new8() /* reduce AConcatBody */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PBody pbodyNode1;
        {
            // Block
        PStatebody pstatebodyNode2;
        PBody pbodyNode3;
        pstatebodyNode2 = (PStatebody)nodeArrayList1.get(0);
        pbodyNode3 = (PBody)nodeArrayList2.get(0);

        pbodyNode1 = new AConcatBody(pstatebodyNode2, pbodyNode3);
        }
	nodeList.add(pbodyNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new9() /* reduce AHeaderStatebody */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PStatebody pstatebodyNode1;
        {
            // Block
        PStateheader pstateheaderNode2;
        PSteps pstepsNode3;
        pstateheaderNode2 = (PStateheader)nodeArrayList1.get(0);
        pstepsNode3 = (PSteps)nodeArrayList2.get(0);

        pstatebodyNode1 = new AHeaderStatebody(pstateheaderNode2, pstepsNode3);
        }
	nodeList.add(pstatebodyNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new10() /* reduce AHeaderStateheader */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList5 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList4 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList3 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PStateheader pstateheaderNode1;
        {
            // Block
        TTokStateLeft ttokstateleftNode2;
        PFid pfidNode3;
        TDot tdotNode4;
        PSid psidNode5;
        TTokStateRight ttokstaterightNode6;
        ttokstateleftNode2 = (TTokStateLeft)nodeArrayList1.get(0);
        pfidNode3 = (PFid)nodeArrayList2.get(0);
        tdotNode4 = (TDot)nodeArrayList3.get(0);
        psidNode5 = (PSid)nodeArrayList4.get(0);
        ttokstaterightNode6 = (TTokStateRight)nodeArrayList5.get(0);

        pstateheaderNode1 = new AHeaderStateheader(ttokstateleftNode2, pfidNode3, tdotNode4, psidNode5, ttokstaterightNode6);
        }
	nodeList.add(pstateheaderNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new11() /* reduce ASimpleSteps */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PSteps pstepsNode1;
        {
            // Block
        PStep pstepNode2;
        pstepNode2 = (PStep)nodeArrayList1.get(0);

        pstepsNode1 = new ASimpleSteps(pstepNode2);
        }
	nodeList.add(pstepsNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new12() /* reduce AConcatSteps */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PSteps pstepsNode1;
        {
            // Block
        PStep pstepNode2;
        PSteps pstepsNode3;
        pstepNode2 = (PStep)nodeArrayList1.get(0);
        pstepsNode3 = (PSteps)nodeArrayList2.get(0);

        pstepsNode1 = new AConcatSteps(pstepNode2, pstepsNode3);
        }
	nodeList.add(pstepsNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new13() /* reduce AEventStep */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList3 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PStep pstepNode1;
        {
            // Block
        PGlobalname pglobalnameNode2;
        TEq teqNode3;
        PLabel plabelNode4;
        pglobalnameNode2 = (PGlobalname)nodeArrayList1.get(0);
        teqNode3 = (TEq)nodeArrayList2.get(0);
        plabelNode4 = (PLabel)nodeArrayList3.get(0);

        pstepNode1 = new AEventStep(pglobalnameNode2, teqNode3, plabelNode4);
        }
	nodeList.add(pstepNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new14() /* reduce AIndexStep */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList5 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList4 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList3 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PStep pstepNode1;
        {
            // Block
        PProcess pprocessNode2;
        TDot tdotNode3;
        PIndex pindexNode4;
        TEq teqNode5;
        PValue pvalueNode6;
        pprocessNode2 = (PProcess)nodeArrayList1.get(0);
        tdotNode3 = (TDot)nodeArrayList2.get(0);
        pindexNode4 = (PIndex)nodeArrayList3.get(0);
        teqNode5 = (TEq)nodeArrayList4.get(0);
        pvalueNode6 = (PValue)nodeArrayList5.get(0);

        pstepNode1 = new AIndexStep(pprocessNode2, tdotNode3, pindexNode4, teqNode5, pvalueNode6);
        }
	nodeList.add(pstepNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new15() /* reduce ANumValue */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PValue pvalueNode1;
        {
            // Block
        PNrval pnrvalNode2;
        pnrvalNode2 = (PNrval)nodeArrayList1.get(0);

        pvalueNode1 = new ANumValue(pnrvalNode2);
        }
	nodeList.add(pvalueNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new16() /* reduce AStrValue */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PValue pvalueNode1;
        {
            // Block
        PCrval pcrvalNode2;
        pcrvalNode2 = (PCrval)nodeArrayList1.get(0);

        pvalueNode1 = new AStrValue(pcrvalNode2);
        }
	nodeList.add(pvalueNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new17() /* reduce AIdLabel */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PLabel plabelNode1;
        {
            // Block
        TIdentifier tidentifierNode2;
        tidentifierNode2 = (TIdentifier)nodeArrayList1.get(0);

        plabelNode1 = new AIdLabel(tidentifierNode2);
        }
	nodeList.add(plabelNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new18() /* reduce AIdGlobalname */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PGlobalname pglobalnameNode1;
        {
            // Block
        TIdentifier tidentifierNode2;
        tidentifierNode2 = (TIdentifier)nodeArrayList1.get(0);

        pglobalnameNode1 = new AIdGlobalname(tidentifierNode2);
        }
	nodeList.add(pglobalnameNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new19() /* reduce AIdProcess */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PProcess pprocessNode1;
        {
            // Block
        TIdentifier tidentifierNode2;
        tidentifierNode2 = (TIdentifier)nodeArrayList1.get(0);

        pprocessNode1 = new AIdProcess(tidentifierNode2);
        }
	nodeList.add(pprocessNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new20() /* reduce AIdIndex */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PIndex pindexNode1;
        {
            // Block
        TIdentifier tidentifierNode2;
        tidentifierNode2 = (TIdentifier)nodeArrayList1.get(0);

        pindexNode1 = new AIdIndex(tidentifierNode2);
        }
	nodeList.add(pindexNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new21() /* reduce ANumNrval */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PNrval pnrvalNode1;
        {
            // Block
        TNumber tnumberNode2;
        tnumberNode2 = (TNumber)nodeArrayList1.get(0);

        pnrvalNode1 = new ANumNrval(tnumberNode2);
        }
	nodeList.add(pnrvalNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new22() /* reduce AIdCrval */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PCrval pcrvalNode1;
        {
            // Block
        TIdentifier tidentifierNode2;
        tidentifierNode2 = (TIdentifier)nodeArrayList1.get(0);

        pcrvalNode1 = new AIdCrval(tidentifierNode2);
        }
	nodeList.add(pcrvalNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new23() /* reduce ANumFid */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PFid pfidNode1;
        {
            // Block
        TNumber tnumberNode2;
        tnumberNode2 = (TNumber)nodeArrayList1.get(0);

        pfidNode1 = new ANumFid(tnumberNode2);
        }
	nodeList.add(pfidNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new24() /* reduce ANumSid */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PSid psidNode1;
        {
            // Block
        TNumber tnumberNode2;
        tnumberNode2 = (TNumber)nodeArrayList1.get(0);

        psidNode1 = new ANumSid(tnumberNode2);
        }
	nodeList.add(psidNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new25() /* reduce AIdSrcmode */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PSrcmode psrcmodeNode1;
        {
            // Block
        TIdentifier tidentifierNode2;
        tidentifierNode2 = (TIdentifier)nodeArrayList1.get(0);

        psrcmodeNode1 = new AIdSrcmode(tidentifierNode2);
        }
	nodeList.add(psrcmodeNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new26() /* reduce AIdTrgmode */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PTrgmode ptrgmodeNode1;
        {
            // Block
        TIdentifier tidentifierNode2;
        tidentifierNode2 = (TIdentifier)nodeArrayList1.get(0);

        ptrgmodeNode1 = new AIdTrgmode(tidentifierNode2);
        }
	nodeList.add(ptrgmodeNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new27() /* reduce ANumBound */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PBound pboundNode1;
        {
            // Block
        TNumber tnumberNode2;
        tnumberNode2 = (TNumber)nodeArrayList1.get(0);

        pboundNode1 = new ANumBound(tnumberNode2);
        }
	nodeList.add(pboundNode1);
        return nodeList;
    }



    private static int[][][] actionTable;
/*      {
			{{-1, ERROR, 0}, {6, SHIFT, 1}, {7, SHIFT, 2}, },
			{{-1, ERROR, 1}, {0, SHIFT, 7}, },
			{{-1, ERROR, 2}, {0, SHIFT, 7}, },
			{{-1, ERROR, 3}, {19, ACCEPT, -1}, },
			{{-1, REDUCE, 0}, },
			{{-1, ERROR, 5}, {11, SHIFT, 10}, },
			{{-1, ERROR, 6}, {11, SHIFT, 11}, },
			{{-1, REDUCE, 25}, },
			{{-1, ERROR, 8}, {8, SHIFT, 12}, },
			{{-1, ERROR, 9}, {9, SHIFT, 13}, },
			{{-1, ERROR, 10}, {12, SHIFT, 14}, },
			{{-1, ERROR, 11}, {13, SHIFT, 15}, },
			{{-1, ERROR, 12}, {0, SHIFT, 16}, },
			{{-1, ERROR, 13}, {0, SHIFT, 16}, },
			{{-1, ERROR, 14}, {14, SHIFT, 19}, },
			{{-1, ERROR, 15}, {14, SHIFT, 20}, },
			{{-1, REDUCE, 26}, },
			{{-1, ERROR, 17}, {10, SHIFT, 21}, },
			{{-1, ERROR, 18}, {10, SHIFT, 22}, },
			{{-1, ERROR, 19}, {16, SHIFT, 23}, },
			{{-1, ERROR, 20}, {16, SHIFT, 23}, },
			{{-1, ERROR, 21}, {4, SHIFT, 28}, {5, SHIFT, 29}, },
			{{-1, ERROR, 22}, {4, SHIFT, 30}, },
			{{-1, ERROR, 23}, {1, SHIFT, 31}, },
			{{-1, REDUCE, 1}, },
			{{-1, REDUCE, 7}, {16, SHIFT, 23}, },
			{{-1, ERROR, 26}, {0, SHIFT, 34}, },
			{{-1, REDUCE, 2}, },
			{{-1, REDUCE, 5}, },
			{{-1, REDUCE, 4}, },
			{{-1, REDUCE, 6}, },
			{{-1, REDUCE, 23}, },
			{{-1, ERROR, 32}, {2, SHIFT, 39}, },
			{{-1, REDUCE, 8}, },
			{{-1, REDUCE, 19}, {3, REDUCE, 18}, },
			{{-1, REDUCE, 9}, },
			{{-1, REDUCE, 11}, {0, SHIFT, 34}, },
			{{-1, ERROR, 37}, {3, SHIFT, 41}, },
			{{-1, ERROR, 38}, {2, SHIFT, 42}, },
			{{-1, ERROR, 39}, {1, SHIFT, 43}, },
			{{-1, REDUCE, 12}, },
			{{-1, ERROR, 41}, {0, SHIFT, 45}, },
			{{-1, ERROR, 42}, {0, SHIFT, 47}, },
			{{-1, REDUCE, 24}, },
			{{-1, ERROR, 44}, {17, SHIFT, 49}, },
			{{-1, REDUCE, 17}, },
			{{-1, REDUCE, 13}, },
			{{-1, REDUCE, 20}, },
			{{-1, ERROR, 48}, {3, SHIFT, 50}, },
			{{-1, REDUCE, 10}, },
			{{-1, ERROR, 50}, {0, SHIFT, 51}, {1, SHIFT, 52}, },
			{{-1, REDUCE, 22}, },
			{{-1, REDUCE, 21}, },
			{{-1, REDUCE, 14}, },
			{{-1, REDUCE, 15}, },
			{{-1, REDUCE, 16}, },
        };*/
    private static int[][][] gotoTable;
/*      {
			{{-1, 3}, },
			{{-1, -1}, },
			{{-1, 4}, },
			{{-1, 5}, },
			{{-1, 6}, },
			{{-1, 24}, {20, 27}, {25, 33}, },
			{{-1, 25}, },
			{{-1, 26}, },
			{{-1, 35}, {36, 40}, },
			{{-1, 36}, },
			{{-1, 53}, },
			{{-1, 46}, },
			{{-1, 37}, },
			{{-1, 38}, },
			{{-1, 48}, },
			{{-1, 54}, },
			{{-1, 55}, },
			{{-1, 32}, },
			{{-1, 44}, },
			{{-1, 8}, {2, 9}, },
			{{-1, 17}, {13, 18}, },
			{{-1, -1}, },
        };*/
    private static String[] errorMessages;
/*      {
			"expecting: '-- specification AG (', '-- specification  G ('",
			"expecting: identifier",
			"expecting: EOF",
			"expecting: '-- as demonstrated by the following execution sequence'",
			"expecting: '-> AX !', '->  X !'",
			"expecting: '-> AX !'",
			"expecting: '->  X !'",
			"expecting: 'Trace Description: CTL Counterexample'",
			"expecting: 'Trace Description: BMC Counterexample'",
			"expecting: 'Trace Type: Counterexample'",
			"expecting: ')'",
			"expecting: '-> State: '",
			"expecting: 'is false', 'is true'",
			"expecting: 'is false'",
			"expecting: number",
			"expecting: '-> State: ', EOF",
			"expecting: '.'",
			"expecting: '.', '='",
			"expecting: identifier, '-> State: ', EOF",
			"expecting: '='",
			"expecting: ' <-'",
			"expecting: identifier, number",
        };*/
    private static int[] errors;
/*      {
			0, 1, 1, 2, 2, 3, 3, 4, 5, 6, 7, 8, 1, 1, 9, 9, 10, 10, 10, 11, 11, 12, 13, 14, 2, 15, 1, 2, 3, 2, 3, 16, 16, 2, 17, 15, 18, 19, 16, 14, 15, 1, 1, 20, 20, 18, 18, 19, 19, 1, 21, 18, 18, 18, 18, 18, 
        };*/

    static 
    {
        try
        {
            DataInputStream s = new DataInputStream(
                new BufferedInputStream(
                Parser.class.getResourceAsStream("parser.dat")));

            // read actionTable
            int length = s.readInt();
            Parser.actionTable = new int[length][][];
            for(int i = 0; i < Parser.actionTable.length; i++)
            {
                length = s.readInt();
                Parser.actionTable[i] = new int[length][3];
                for(int j = 0; j < Parser.actionTable[i].length; j++)
                {
                for(int k = 0; k < 3; k++)
                {
                    Parser.actionTable[i][j][k] = s.readInt();
                }
                }
            }

            // read gotoTable
            length = s.readInt();
            gotoTable = new int[length][][];
            for(int i = 0; i < gotoTable.length; i++)
            {
                length = s.readInt();
                gotoTable[i] = new int[length][2];
                for(int j = 0; j < gotoTable[i].length; j++)
                {
                for(int k = 0; k < 2; k++)
                {
                    gotoTable[i][j][k] = s.readInt();
                }
                }
            }

            // read errorMessages
            length = s.readInt();
            errorMessages = new String[length];
            for(int i = 0; i < errorMessages.length; i++)
            {
                length = s.readInt();
                StringBuffer buffer = new StringBuffer();

                for(int j = 0; j < length; j++)
                {
                buffer.append(s.readChar());
                }
                errorMessages[i] = buffer.toString();
            }

            // read errors
            length = s.readInt();
            errors = new int[length];
            for(int i = 0; i < errors.length; i++)
            {
                errors[i] = s.readInt();
            }

            s.close();
        }
        catch(Exception e)
        {
            throw new RuntimeException("The file \"parser.dat\" is either missing or corrupted.");
        }
    }
}

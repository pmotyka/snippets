/*
Example compile/run:
$ javac IntegerToBinaryString.java
$ java IntegerToBinaryString 2147483646
1111111111111111111111111111110
*/
class IntegerToBinaryString
{
    public static void main(String[] args) {
	//assume valid integer passed in as first command line arg, will throw an NFE if otherwise
        int i = Integer.parseInt(args[0]);
        StringBuffer buf = new StringBuffer();
        do {
	    //insert rightmost bit and'd with mask of 1 in leftmost position
            buf.insert(0, i & 1);
            //discard rightmost bit via shift / assignment
            i >>= 1;
        } while (i != 0); //terminate when all bits discarded
        System.out.println(buf.toString());
    }
}

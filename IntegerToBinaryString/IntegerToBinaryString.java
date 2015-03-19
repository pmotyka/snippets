class IntegerToBinaryString
{
    public static void main(String[] args) {
       
	//assume valid integer passed in as first command line arg,
	//will throw a NFE is otherwise
        int i = Integer.parseInt(args[0]);
        StringBuffer buf = new StringBuffer();
        do {
	    //insert bit in leftmost position
            buf.insert(0, i & 1);
            //discard rightmost bit via bit shift / assignment
            i >>= 1;
        } while (i != 0); //terminate when all bits discarded

        System.out.println(buf.toString());
    }
}

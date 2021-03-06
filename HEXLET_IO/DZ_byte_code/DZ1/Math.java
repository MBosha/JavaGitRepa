public class Math {

    public static int min(int a, int b) {
        if (a < b)
            return a;
        else
            return b;
    }
    // BEGIN
    mv.visitVarInsn(Opcodes.ILOAD, 0);
    mv.visitVarInsn(Opcodes.ILOAD, 1);
    mv.visitJumpInsn(Opcodes.IF_ICMPGE, elseLabel);
    mv.visitVarInsn(Opcodes.ILOAD, 0);
    mv.visitInsn(Opcodes.IRETURN);
    mv.visitLabel(elseLabel);
    mv.visitVarInsn(Opcodes.ILOAD, 1);
    mv.visitInsn(Opcodes.IRETURN);
    mv.visitMaxs(2, 2);
    // END



    public static int min(int a, int b, int c) {
        if (a < b && a < c) return a;
        if (b < c) return b;
        return c;
    }
}
// BEGIN
// comparing local variable 0 with 1 and saving min to the 0
mv.visitVarInsn(Opcodes.ILOAD, 0);
mv.visitVarInsn(Opcodes.ILOAD, 1);
mv.visitJumpInsn(Opcodes.IF_ICMPLE, elseLabel);
mv.visitVarInsn(Opcodes.ILOAD, 1);
mv.visitVarInsn(Opcodes.ISTORE, 0);
mv.visitLabel(elseLabel);

// comparing local variable 0 with 2 and saving min to the 0
mv.visitVarInsn(Opcodes.ILOAD, 0);
mv.visitVarInsn(Opcodes.ILOAD, 2);
mv.visitJumpInsn(Opcodes.IF_ICMPLE, elseLabel2);
mv.visitVarInsn(Opcodes.ILOAD, 2);
mv.visitVarInsn(Opcodes.ISTORE, 0);
mv.visitLabel(elseLabel2);

// returning local variable 0 (since it's the minimum)
mv.visitVarInsn(Opcodes.ILOAD, 0);
mv.visitInsn(Opcodes.IRETURN);
mv.visitMaxs(2, 2);
// END

package net.javacogito.instr.total;


import net.javacogito.CommonTextProcessor;
import net.javacogito.Processor;
import static net.javacogito.Constants.*;

public class JvmInstructionTotalLinkingExProcessor extends JvmInstructionTotalCommonProcessor{

    @Override
    protected String processText(String inText) {
        String preparedText = new CommonTextProcessor().process(inText);

        StringBuilder sb = new StringBuilder();
        sb.append(ONE_EMPTY_LINE).append(NL);
        sb.append(TABLE_HEADER_BORDER_COLLAPSE).append(NL);
        sb.append(PIPE).append(TABLE_FORMAT_WIDTH_150).append(TABLE_FORMAT_VERTICAL_ALIGN_TOP).append(PIPE).append(BOLD).append(LINKING_EXCEPTIONS).append(BOLD).append(NL);
        sb.append(PIPE).append(TABLE_FORMAT_VERTICAL_ALIGN_TOP).append(PIPE).append(preparedText).append(NL);
        sb.append(TABLE_FOOTER).append(NL);
        return sb.toString();
    }
}

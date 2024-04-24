package jadx.core.dex.visitors.typeinference;

import jadx.core.dex.nodes.MethodNode;
import jadx.core.dex.instructions.args.ArgType;
import jadx.core.dex.instructions.args.SSAVar;

public class TypeUpdateParam {
    private final MethodNode mth;
    private final SSAVar ssaVar;
    private final ArgType candidateType;

    public TypeUpdateParam(MethodNode mth, SSAVar ssaVar, ArgType candidateType) {
        this.mth = mth;
        this.ssaVar = ssaVar;
        this.candidateType = candidateType;
    }

    public MethodNode getMethodNode() {
        return mth;
    }

    public SSAVar getSSAVar() {
        return ssaVar;
    }

    public ArgType getCandidateType() {
        return candidateType;
    }
}
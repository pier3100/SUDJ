VolumeFaderCurve {
    *kr { arg in;
        //^in*in.linlin(0,1,-60,0).dbamp;
        ^in;
    }
}

+ SimpleNumber{
    volumeFaderCurve{
        ^this.value*this.value.linlin(0,1,-60,0).dbamp;
    }
}

+ SequenceableCollection{
    volumeFaderCurve { 
        ^this.performUnaryOp('volumeFaderCurve');
    }
}
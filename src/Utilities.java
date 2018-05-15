

import java.util.EnumMap;

import com.digitalpersona.onetouch.DPFPFingerIndex;

class Utilities {

    private static final EnumMap<DPFPFingerIndex, String> fingerNames;
    static {
    	fingerNames = new EnumMap<DPFPFingerIndex, String>(DPFPFingerIndex.class);
    	fingerNames.put(DPFPFingerIndex.LEFT_PINKY,   "Meñique Izquierdo");
    	fingerNames.put(DPFPFingerIndex.LEFT_RING,    "Anular Izquierdo");
    	fingerNames.put(DPFPFingerIndex.LEFT_MIDDLE,  "Corazon Izquierdo");
    	fingerNames.put(DPFPFingerIndex.LEFT_INDEX,   "Indice Izquierdo");
    	fingerNames.put(DPFPFingerIndex.LEFT_THUMB,   "Pulgar Izquierdo");
    	
    	fingerNames.put(DPFPFingerIndex.RIGHT_PINKY,  "Meñique Derecho");
    	fingerNames.put(DPFPFingerIndex.RIGHT_RING,   "Anular Derecho");
    	fingerNames.put(DPFPFingerIndex.RIGHT_MIDDLE, "Corazon Derecho");
    	fingerNames.put(DPFPFingerIndex.LEFT_INDEX,   "Indice Derecho");
    	fingerNames.put(DPFPFingerIndex.RIGHT_INDEX,  "Indice Derecho");
    	fingerNames.put(DPFPFingerIndex.RIGHT_THUMB,  "Pulgar Derecho");
    }

    public static String fingerName(DPFPFingerIndex finger) {
    	return fingerNames.get(finger); 
    }
    public static String fingerprintName(DPFPFingerIndex finger) {
    	return fingerNames.get(finger) + " huellas dactilres"; 
    }
    
}

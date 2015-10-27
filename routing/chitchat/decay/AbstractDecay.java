package routing.chitchat.decay;

import core.Settings;
import routing.chitchat.decay.LinearDecay;
import routing.chitchat.decay.LogisticDecay;

public abstract class AbstractDecay {
	public AbstractDecay(Settings s) {}
	abstract public double eval(double x);
}

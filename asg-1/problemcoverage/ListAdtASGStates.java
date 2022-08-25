import java.lang.annotation.*;
public class ListAdtASGStates {
	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.RUNTIME)
	public @interface State {
		public String state() default "";
	}
	@State(state="<'a'|'b'>")
	public static ListADT state0() {
		ListADT o = new ListIMP();
		// TODO Set initial state, if applicable
		return o;
	}
	@State(state="<'a'|>")
	public static ListADT state1() {
		ListADT o = new ListIMP();
		// TODO Set initial state, if applicable
		return o;
	}
	@State(state="<'a','b'|>")
	public static ListADT state2() {
		ListADT o = new ListIMP();
		// TODO Set initial state, if applicable
		return o;
	}
	@State(state="<'a','b','c'|>")
	public static ListADT state3() {
		ListADT o = new ListIMP();
		// TODO Set initial state, if applicable
		return o;
	}
	@State(state="<'a','b'|'c'>")
	public static ListADT state4() {
		ListADT o = new ListIMP();
		// TODO Set initial state, if applicable
		return o;
	}
	@State(state="<|>")
	public static ListADT state5() {
		ListADT o = new ListIMP();
		// TODO Set initial state, if applicable
		return o;
	}
	@State(state="<|'a','b','c'>")
	public static ListADT state6() {
		ListADT o = new ListIMP();
		// TODO Set initial state, if applicable
		return o;
	}
	@State(state="<'a','b','d','c'>")
	public static ListADT state7() {
		ListADT o = new ListIMP();
		// TODO Set initial state, if applicable
		return o;
	}
	@State(state="<'a','b'|'c','d'>")
	public static ListADT state8() {
		ListADT o = new ListIMP();
		// TODO Set initial state, if applicable
		return o;
	}
	@State(state="<'w'|,'x','y','z'>")
	public static ListADT state9() {
		ListADT o = new ListIMP();
		// TODO Set initial state, if applicable
		return o;
	}
	@State(state="<'a'|'b','c'>")
	public static ListADT state10() {
		ListADT o = new ListIMP();
		// TODO Set initial state, if applicable
		return o;
	}
}

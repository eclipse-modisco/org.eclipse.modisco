<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="GenerateMetricsA"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="metric"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="Sequence"/>
		<constant value="QJ.first():J"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.CreateMetric():V"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="18:39-18:51"/>
		<constant value="self"/>
		<constant value="__resolve__"/>
		<constant value="1"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():B"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="2"/>
		<constant value="A.__resolve__(J):J"/>
		<constant value="QJ.including(J):QJ"/>
		<constant value="QJ.flatten():QJ"/>
		<constant value="e"/>
		<constant value="value"/>
		<constant value="resolveTemp"/>
		<constant value="S"/>
		<constant value="NTransientLink;.getNamedTargetFromSource(JS):J"/>
		<constant value="name"/>
		<constant value="__matcher__"/>
		<constant value="A.__matchCreateMetricValue():V"/>
		<constant value="__exec__"/>
		<constant value="CreateMetricValue"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyCreateMetricValue(NTransientLink;):V"/>
		<constant value="CreateMetric"/>
		<constant value="Metric"/>
		<constant value="Metrics"/>
		<constant value="Number of methods per Entity class"/>
		<constant value="23:12-23:48"/>
		<constant value="23:4-23:48"/>
		<constant value="26:3-26:13"/>
		<constant value="26:24-26:26"/>
		<constant value="26:3-26:27"/>
		<constant value="25:2-27:3"/>
		<constant value="om"/>
		<constant value="__matchCreateMetricValue"/>
		<constant value="ClassDeclaration"/>
		<constant value="Java"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="annotations"/>
		<constant value="type"/>
		<constant value="Entity"/>
		<constant value="J.=(J):J"/>
		<constant value="B.or(B):B"/>
		<constant value="B.not():B"/>
		<constant value="42"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="cd"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="mv"/>
		<constant value="IntegerMetricValue"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="33:4-33:6"/>
		<constant value="33:4-33:18"/>
		<constant value="33:31-33:32"/>
		<constant value="33:31-33:37"/>
		<constant value="33:31-33:42"/>
		<constant value="33:31-33:47"/>
		<constant value="33:48-33:56"/>
		<constant value="33:31-33:56"/>
		<constant value="33:4-33:57"/>
		<constant value="36:3-42:4"/>
		<constant value="a"/>
		<constant value="__applyCreateMetricValue"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="tag"/>
		<constant value="bodyDeclarations"/>
		<constant value="4"/>
		<constant value="AbstractMethodDeclaration"/>
		<constant value="J.oclIsKindOf(J):J"/>
		<constant value="39"/>
		<constant value="CJ.including(J):CJ"/>
		<constant value="J.size():J"/>
		<constant value="37:14-37:24"/>
		<constant value="37:14-37:31"/>
		<constant value="37:4-37:31"/>
		<constant value="38:11-38:13"/>
		<constant value="38:11-38:18"/>
		<constant value="38:4-38:18"/>
		<constant value="39:13-39:15"/>
		<constant value="39:13-39:32"/>
		<constant value="40:19-40:21"/>
		<constant value="40:34-40:64"/>
		<constant value="40:19-40:65"/>
		<constant value="39:13-40:66"/>
		<constant value="39:13-41:13"/>
		<constant value="39:4-41:13"/>
		<constant value="bd"/>
		<constant value="link"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<field name="5" type="4"/>
	<operation name="6">
		<context type="7"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="8"/>
			<push arg="9"/>
			<new/>
			<dup/>
			<push arg="10"/>
			<pcall arg="11"/>
			<dup/>
			<push arg="12"/>
			<push arg="9"/>
			<new/>
			<dup/>
			<push arg="13"/>
			<pcall arg="11"/>
			<pcall arg="14"/>
			<set arg="3"/>
			<getasm/>
			<push arg="15"/>
			<push arg="9"/>
			<new/>
			<call arg="16"/>
			<set arg="5"/>
			<getasm/>
			<push arg="17"/>
			<push arg="9"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<pcall arg="18"/>
			<getasm/>
			<pcall arg="19"/>
			<getasm/>
			<pcall arg="20"/>
		</code>
		<linenumbertable>
			<lne id="21" begin="17" end="20"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="22" begin="0" end="32"/>
		</localvariabletable>
	</operation>
	<operation name="23">
		<context type="7"/>
		<parameters>
			<parameter name="24" type="4"/>
		</parameters>
		<code>
			<load arg="24"/>
			<getasm/>
			<get arg="3"/>
			<call arg="25"/>
			<if arg="26"/>
			<getasm/>
			<get arg="1"/>
			<load arg="24"/>
			<call arg="27"/>
			<dup/>
			<call arg="28"/>
			<if arg="29"/>
			<load arg="24"/>
			<call arg="30"/>
			<goto arg="31"/>
			<pop/>
			<load arg="24"/>
			<goto arg="32"/>
			<push arg="15"/>
			<push arg="9"/>
			<new/>
			<load arg="24"/>
			<iterate/>
			<store arg="33"/>
			<getasm/>
			<load arg="33"/>
			<call arg="34"/>
			<call arg="35"/>
			<enditerate/>
			<call arg="36"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="37" begin="23" end="27"/>
			<lve slot="0" name="22" begin="0" end="29"/>
			<lve slot="1" name="38" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="39">
		<context type="7"/>
		<parameters>
			<parameter name="24" type="4"/>
			<parameter name="33" type="40"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="24"/>
			<call arg="27"/>
			<load arg="24"/>
			<load arg="33"/>
			<call arg="41"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="22" begin="0" end="6"/>
			<lve slot="1" name="38" begin="0" end="6"/>
			<lve slot="2" name="42" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="43">
		<context type="7"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<pcall arg="44"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="22" begin="0" end="1"/>
		</localvariabletable>
	</operation>
	<operation name="45">
		<context type="7"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="46"/>
			<call arg="47"/>
			<iterate/>
			<store arg="24"/>
			<getasm/>
			<load arg="24"/>
			<pcall arg="48"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="37" begin="5" end="8"/>
			<lve slot="0" name="22" begin="0" end="9"/>
		</localvariabletable>
	</operation>
	<operation name="49">
		<context type="7"/>
		<parameters>
		</parameters>
		<code>
			<push arg="50"/>
			<push arg="51"/>
			<new/>
			<store arg="24"/>
			<load arg="24"/>
			<dup/>
			<getasm/>
			<push arg="52"/>
			<call arg="34"/>
			<set arg="42"/>
			<pop/>
			<getasm/>
			<load arg="24"/>
			<set arg="5"/>
		</code>
		<linenumbertable>
			<lne id="53" begin="7" end="7"/>
			<lne id="54" begin="5" end="9"/>
			<lne id="55" begin="11" end="11"/>
			<lne id="56" begin="12" end="12"/>
			<lne id="57" begin="11" end="13"/>
			<lne id="58" begin="11" end="13"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="59" begin="3" end="13"/>
			<lve slot="0" name="22" begin="0" end="13"/>
		</localvariabletable>
	</operation>
	<operation name="60">
		<context type="7"/>
		<parameters>
		</parameters>
		<code>
			<push arg="61"/>
			<push arg="62"/>
			<findme/>
			<push arg="63"/>
			<call arg="64"/>
			<iterate/>
			<store arg="24"/>
			<pushf/>
			<load arg="24"/>
			<get arg="65"/>
			<iterate/>
			<store arg="33"/>
			<load arg="33"/>
			<get arg="66"/>
			<get arg="66"/>
			<get arg="42"/>
			<push arg="67"/>
			<call arg="68"/>
			<call arg="69"/>
			<enditerate/>
			<call arg="70"/>
			<if arg="71"/>
			<getasm/>
			<get arg="1"/>
			<push arg="72"/>
			<push arg="9"/>
			<new/>
			<dup/>
			<push arg="46"/>
			<pcall arg="73"/>
			<dup/>
			<push arg="74"/>
			<load arg="24"/>
			<pcall arg="75"/>
			<dup/>
			<push arg="76"/>
			<push arg="77"/>
			<push arg="51"/>
			<new/>
			<pcall arg="78"/>
			<pusht/>
			<pcall arg="79"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="80" begin="8" end="8"/>
			<lne id="81" begin="8" end="9"/>
			<lne id="82" begin="12" end="12"/>
			<lne id="83" begin="12" end="13"/>
			<lne id="84" begin="12" end="14"/>
			<lne id="85" begin="12" end="15"/>
			<lne id="86" begin="16" end="16"/>
			<lne id="87" begin="12" end="17"/>
			<lne id="88" begin="7" end="19"/>
			<lne id="89" begin="34" end="39"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="90" begin="11" end="18"/>
			<lve slot="1" name="74" begin="6" end="41"/>
			<lve slot="0" name="22" begin="0" end="42"/>
		</localvariabletable>
	</operation>
	<operation name="91">
		<context type="7"/>
		<parameters>
			<parameter name="24" type="92"/>
		</parameters>
		<code>
			<load arg="24"/>
			<push arg="74"/>
			<call arg="93"/>
			<store arg="33"/>
			<load arg="24"/>
			<push arg="76"/>
			<call arg="94"/>
			<store arg="95"/>
			<load arg="95"/>
			<dup/>
			<getasm/>
			<getasm/>
			<get arg="5"/>
			<call arg="34"/>
			<set arg="5"/>
			<dup/>
			<getasm/>
			<load arg="33"/>
			<get arg="42"/>
			<call arg="34"/>
			<set arg="96"/>
			<dup/>
			<getasm/>
			<push arg="15"/>
			<push arg="9"/>
			<new/>
			<load arg="33"/>
			<get arg="97"/>
			<iterate/>
			<store arg="98"/>
			<load arg="98"/>
			<push arg="99"/>
			<push arg="62"/>
			<findme/>
			<call arg="100"/>
			<call arg="70"/>
			<if arg="101"/>
			<load arg="98"/>
			<call arg="102"/>
			<enditerate/>
			<call arg="103"/>
			<call arg="34"/>
			<set arg="38"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="104" begin="11" end="11"/>
			<lne id="105" begin="11" end="12"/>
			<lne id="106" begin="9" end="14"/>
			<lne id="107" begin="17" end="17"/>
			<lne id="108" begin="17" end="18"/>
			<lne id="109" begin="15" end="20"/>
			<lne id="110" begin="26" end="26"/>
			<lne id="111" begin="26" end="27"/>
			<lne id="112" begin="30" end="30"/>
			<lne id="113" begin="31" end="33"/>
			<lne id="114" begin="30" end="34"/>
			<lne id="115" begin="23" end="39"/>
			<lne id="116" begin="23" end="40"/>
			<lne id="117" begin="21" end="42"/>
			<lne id="89" begin="8" end="43"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="4" name="118" begin="29" end="38"/>
			<lve slot="3" name="76" begin="7" end="43"/>
			<lve slot="2" name="74" begin="3" end="43"/>
			<lve slot="0" name="22" begin="0" end="43"/>
			<lve slot="1" name="119" begin="0" end="43"/>
		</localvariabletable>
	</operation>
</asm>

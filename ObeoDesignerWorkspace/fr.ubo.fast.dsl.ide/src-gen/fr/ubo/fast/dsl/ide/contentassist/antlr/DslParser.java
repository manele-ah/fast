/*
 * generated by Xtext 2.14.0
 */
package fr.ubo.fast.dsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import fr.ubo.fast.dsl.ide.contentassist.antlr.internal.InternalDslParser;
import fr.ubo.fast.dsl.services.DslGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class DslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(DslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, DslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getScaleAccess().getAlternatives(), "rule__Scale__Alternatives");
			builder.put(grammarAccess.getDataSourceAccess().getAlternatives(), "rule__DataSource__Alternatives");
			builder.put(grammarAccess.getServiceAccess().getAlternatives(), "rule__Service__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getEDoubleAccess().getAlternatives_4_0(), "rule__EDouble__Alternatives_4_0");
			builder.put(grammarAccess.getMeasurementDataUnitAccess().getAlternatives(), "rule__MeasurementDataUnit__Alternatives");
			builder.put(grammarAccess.getPeriodAccess().getAlternatives(), "rule__Period__Alternatives");
			builder.put(grammarAccess.getOSTypeAccess().getAlternatives(), "rule__OSType__Alternatives");
			builder.put(grammarAccess.getDatabaseTypeAccess().getAlternatives(), "rule__DatabaseType__Alternatives");
			builder.put(grammarAccess.getWebServerTypeAccess().getAlternatives(), "rule__WebServerType__Alternatives");
			builder.put(grammarAccess.getTimeSeriesFrameworkAccess().getGroup(), "rule__TimeSeriesFramework__Group__0");
			builder.put(grammarAccess.getTimeSeriesFrameworkAccess().getGroup_6(), "rule__TimeSeriesFramework__Group_6__0");
			builder.put(grammarAccess.getDataAccess().getGroup(), "rule__Data__Group__0");
			builder.put(grammarAccess.getDataAccess().getGroup_6(), "rule__Data__Group_6__0");
			builder.put(grammarAccess.getDataAccess().getGroup_13(), "rule__Data__Group_13__0");
			builder.put(grammarAccess.getPlatformAccess().getGroup(), "rule__Platform__Group__0");
			builder.put(grammarAccess.getPlatformAccess().getGroup_6(), "rule__Platform__Group_6__0");
			builder.put(grammarAccess.getPlatformAccess().getGroup_13(), "rule__Platform__Group_13__0");
			builder.put(grammarAccess.getMinMaxVisualizationClientAccess().getGroup(), "rule__MinMaxVisualizationClient__Group__0");
			builder.put(grammarAccess.getTimeSeriesAccess().getGroup(), "rule__TimeSeries__Group__0");
			builder.put(grammarAccess.getSensorAccess().getGroup(), "rule__Sensor__Group__0");
			builder.put(grammarAccess.getSensorAccess().getGroup_3(), "rule__Sensor__Group_3__0");
			builder.put(grammarAccess.getSensorAccess().getGroup_3_2(), "rule__Sensor__Group_3_2__0");
			builder.put(grammarAccess.getSensorAccess().getGroup_6(), "rule__Sensor__Group_6__0");
			builder.put(grammarAccess.getMeasuredVariableAccess().getGroup(), "rule__MeasuredVariable__Group__0");
			builder.put(grammarAccess.getMeasuredVariableAccess().getGroup_3(), "rule__MeasuredVariable__Group_3__0");
			builder.put(grammarAccess.getMeasuredVariableAccess().getGroup_3_3(), "rule__MeasuredVariable__Group_3_3__0");
			builder.put(grammarAccess.getMetaDataAccess().getGroup(), "rule__MetaData__Group__0");
			builder.put(grammarAccess.getDatabaseAccess().getGroup(), "rule__Database__Group__0");
			builder.put(grammarAccess.getFileAccess().getGroup(), "rule__File__Group__0");
			builder.put(grammarAccess.getComputerAccess().getGroup(), "rule__Computer__Group__0");
			builder.put(grammarAccess.getComputerAccess().getGroup_24(), "rule__Computer__Group_24__0");
			builder.put(grammarAccess.getComputerAccess().getGroup_24_2(), "rule__Computer__Group_24_2__0");
			builder.put(grammarAccess.getComputerAccess().getGroup_25(), "rule__Computer__Group_25__0");
			builder.put(grammarAccess.getDockerDeploymentAccess().getGroup(), "rule__DockerDeployment__Group__0");
			builder.put(grammarAccess.getDockerDeploymentAccess().getGroup_8(), "rule__DockerDeployment__Group_8__0");
			builder.put(grammarAccess.getNetworkAccess().getGroup(), "rule__Network__Group__0");
			builder.put(grammarAccess.getNetworkAccess().getGroup_14(), "rule__Network__Group_14__0");
			builder.put(grammarAccess.getContainerAccess().getGroup(), "rule__Container__Group__0");
			builder.put(grammarAccess.getContainerAccess().getGroup_7(), "rule__Container__Group_7__0");
			builder.put(grammarAccess.getNetworkInterfaceAccess().getGroup(), "rule__NetworkInterface__Group__0");
			builder.put(grammarAccess.getWebServerAccess().getGroup(), "rule__WebServer__Group__0");
			builder.put(grammarAccess.getWebServerAccess().getGroup_5(), "rule__WebServer__Group_5__0");
			builder.put(grammarAccess.getWebServerAccess().getGroup_5_2(), "rule__WebServer__Group_5_2__0");
			builder.put(grammarAccess.getCalendarScaleAccess().getGroup(), "rule__CalendarScale__Group__0");
			builder.put(grammarAccess.getCalendarScaleAccess().getGroup_6(), "rule__CalendarScale__Group_6__0");
			builder.put(grammarAccess.getFactorScaleAccess().getGroup(), "rule__FactorScale__Group__0");
			builder.put(grammarAccess.getELongAccess().getGroup(), "rule__ELong__Group__0");
			builder.put(grammarAccess.getEDoubleAccess().getGroup(), "rule__EDouble__Group__0");
			builder.put(grammarAccess.getEDoubleAccess().getGroup_4(), "rule__EDouble__Group_4__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getTimeSeriesFrameworkAccess().getPlatformAssignment_0(), "rule__TimeSeriesFramework__PlatformAssignment_0");
			builder.put(grammarAccess.getTimeSeriesFrameworkAccess().getDataAssignment_1(), "rule__TimeSeriesFramework__DataAssignment_1");
			builder.put(grammarAccess.getTimeSeriesFrameworkAccess().getClientsAssignment_4(), "rule__TimeSeriesFramework__ClientsAssignment_4");
			builder.put(grammarAccess.getTimeSeriesFrameworkAccess().getClientsAssignment_6_0(), "rule__TimeSeriesFramework__ClientsAssignment_6_0");
			builder.put(grammarAccess.getDataAccess().getSensorsDataAssignment_4(), "rule__Data__SensorsDataAssignment_4");
			builder.put(grammarAccess.getDataAccess().getSensorsDataAssignment_6_0(), "rule__Data__SensorsDataAssignment_6_0");
			builder.put(grammarAccess.getDataAccess().getTimeSeriesDataAssignment_11(), "rule__Data__TimeSeriesDataAssignment_11");
			builder.put(grammarAccess.getDataAccess().getTimeSeriesDataAssignment_13_0(), "rule__Data__TimeSeriesDataAssignment_13_0");
			builder.put(grammarAccess.getPlatformAccess().getComputersPlatformAssignment_4(), "rule__Platform__ComputersPlatformAssignment_4");
			builder.put(grammarAccess.getPlatformAccess().getComputersPlatformAssignment_6_0(), "rule__Platform__ComputersPlatformAssignment_6_0");
			builder.put(grammarAccess.getPlatformAccess().getNetworksPlatformAssignment_11(), "rule__Platform__NetworksPlatformAssignment_11");
			builder.put(grammarAccess.getPlatformAccess().getNetworksPlatformAssignment_13_0(), "rule__Platform__NetworksPlatformAssignment_13_0");
			builder.put(grammarAccess.getMinMaxVisualizationClientAccess().getNameAssignment_1(), "rule__MinMaxVisualizationClient__NameAssignment_1");
			builder.put(grammarAccess.getMinMaxVisualizationClientAccess().getTimeSeriesSelectedAssignment_3(), "rule__MinMaxVisualizationClient__TimeSeriesSelectedAssignment_3");
			builder.put(grammarAccess.getMinMaxVisualizationClientAccess().getClientComputerAssignment_5(), "rule__MinMaxVisualizationClient__ClientComputerAssignment_5");
			builder.put(grammarAccess.getMinMaxVisualizationClientAccess().getChartWidthAssignment_7(), "rule__MinMaxVisualizationClient__ChartWidthAssignment_7");
			builder.put(grammarAccess.getMinMaxVisualizationClientAccess().getChartHeightAssignment_9(), "rule__MinMaxVisualizationClient__ChartHeightAssignment_9");
			builder.put(grammarAccess.getMinMaxVisualizationClientAccess().getAxisFactorAssignment_11(), "rule__MinMaxVisualizationClient__AxisFactorAssignment_11");
			builder.put(grammarAccess.getMinMaxVisualizationClientAccess().getUserPolicyAssignment_14(), "rule__MinMaxVisualizationClient__UserPolicyAssignment_14");
			builder.put(grammarAccess.getMinMaxVisualizationClientAccess().getClientScaleAssignment_16(), "rule__MinMaxVisualizationClient__ClientScaleAssignment_16");
			builder.put(grammarAccess.getMinMaxVisualizationClientAccess().getUserTimeAssignment_19(), "rule__MinMaxVisualizationClient__UserTimeAssignment_19");
			builder.put(grammarAccess.getMinMaxVisualizationClientAccess().getPingTimeAssignment_22(), "rule__MinMaxVisualizationClient__PingTimeAssignment_22");
			builder.put(grammarAccess.getMinMaxVisualizationClientAccess().getRawDataThresholdAssignment_25(), "rule__MinMaxVisualizationClient__RawDataThresholdAssignment_25");
			builder.put(grammarAccess.getMinMaxVisualizationClientAccess().getPreComputedDataThresholdAssignment_28(), "rule__MinMaxVisualizationClient__PreComputedDataThresholdAssignment_28");
			builder.put(grammarAccess.getTimeSeriesAccess().getNameAssignment_0(), "rule__TimeSeries__NameAssignment_0");
			builder.put(grammarAccess.getTimeSeriesAccess().getTimeSeriesMeasuredVariableAssignment_2(), "rule__TimeSeries__TimeSeriesMeasuredVariableAssignment_2");
			builder.put(grammarAccess.getTimeSeriesAccess().getStartTimeAssignment_6(), "rule__TimeSeries__StartTimeAssignment_6");
			builder.put(grammarAccess.getTimeSeriesAccess().getEndTimeAssignment_9(), "rule__TimeSeries__EndTimeAssignment_9");
			builder.put(grammarAccess.getTimeSeriesAccess().getPeriodAssignment_12(), "rule__TimeSeries__PeriodAssignment_12");
			builder.put(grammarAccess.getTimeSeriesAccess().getTimeSeriesDataSourceAssignment_15(), "rule__TimeSeries__TimeSeriesDataSourceAssignment_15");
			builder.put(grammarAccess.getSensorAccess().getNameAssignment_0(), "rule__Sensor__NameAssignment_0");
			builder.put(grammarAccess.getSensorAccess().getSensorMetaDataAssignment_3_0(), "rule__Sensor__SensorMetaDataAssignment_3_0");
			builder.put(grammarAccess.getSensorAccess().getSensorMetaDataAssignment_3_2_0(), "rule__Sensor__SensorMetaDataAssignment_3_2_0");
			builder.put(grammarAccess.getSensorAccess().getSensorMeasuredVariablesAssignment_4(), "rule__Sensor__SensorMeasuredVariablesAssignment_4");
			builder.put(grammarAccess.getSensorAccess().getSensorMeasuredVariablesAssignment_6_0(), "rule__Sensor__SensorMeasuredVariablesAssignment_6_0");
			builder.put(grammarAccess.getMeasuredVariableAccess().getNameAssignment_0(), "rule__MeasuredVariable__NameAssignment_0");
			builder.put(grammarAccess.getMeasuredVariableAccess().getUnitAssignment_2(), "rule__MeasuredVariable__UnitAssignment_2");
			builder.put(grammarAccess.getMeasuredVariableAccess().getMeasuredVariableMetaDataAssignment_3_1(), "rule__MeasuredVariable__MeasuredVariableMetaDataAssignment_3_1");
			builder.put(grammarAccess.getMeasuredVariableAccess().getMeasuredVariableMetaDataAssignment_3_3_0(), "rule__MeasuredVariable__MeasuredVariableMetaDataAssignment_3_3_0");
			builder.put(grammarAccess.getMetaDataAccess().getNameAssignment_1(), "rule__MetaData__NameAssignment_1");
			builder.put(grammarAccess.getMetaDataAccess().getValueAssignment_3(), "rule__MetaData__ValueAssignment_3");
			builder.put(grammarAccess.getDatabaseAccess().getNameAssignment_0(), "rule__Database__NameAssignment_0");
			builder.put(grammarAccess.getDatabaseAccess().getDbmsAssignment_2(), "rule__Database__DbmsAssignment_2");
			builder.put(grammarAccess.getDatabaseAccess().getPortAssignment_4(), "rule__Database__PortAssignment_4");
			builder.put(grammarAccess.getDatabaseAccess().getUsernameAssignment_6(), "rule__Database__UsernameAssignment_6");
			builder.put(grammarAccess.getDatabaseAccess().getPasswordAssignment_8(), "rule__Database__PasswordAssignment_8");
			builder.put(grammarAccess.getDatabaseAccess().getDataDirectoryAssignment_10(), "rule__Database__DataDirectoryAssignment_10");
			builder.put(grammarAccess.getFileAccess().getNameAssignment_0(), "rule__File__NameAssignment_0");
			builder.put(grammarAccess.getFileAccess().getPathAssignment_2(), "rule__File__PathAssignment_2");
			builder.put(grammarAccess.getComputerAccess().getNameAssignment_1(), "rule__Computer__NameAssignment_1");
			builder.put(grammarAccess.getComputerAccess().getOsAssignment_3(), "rule__Computer__OsAssignment_3");
			builder.put(grammarAccess.getComputerAccess().getRamMemoryAssignment_5(), "rule__Computer__RamMemoryAssignment_5");
			builder.put(grammarAccess.getComputerAccess().getStorageMemoryAssignment_7(), "rule__Computer__StorageMemoryAssignment_7");
			builder.put(grammarAccess.getComputerAccess().getCpuNumberAssignment_9(), "rule__Computer__CpuNumberAssignment_9");
			builder.put(grammarAccess.getComputerAccess().getCpuCoresNumberAssignment_11(), "rule__Computer__CpuCoresNumberAssignment_11");
			builder.put(grammarAccess.getComputerAccess().getCpuFrequencyAssignment_13(), "rule__Computer__CpuFrequencyAssignment_13");
			builder.put(grammarAccess.getComputerAccess().getUsernameAssignment_15(), "rule__Computer__UsernameAssignment_15");
			builder.put(grammarAccess.getComputerAccess().getPasswordAssignment_17(), "rule__Computer__PasswordAssignment_17");
			builder.put(grammarAccess.getComputerAccess().getComputerNetworkInterfacesAssignment_21(), "rule__Computer__ComputerNetworkInterfacesAssignment_21");
			builder.put(grammarAccess.getComputerAccess().getComputerNetworkInterfacesAssignment_22(), "rule__Computer__ComputerNetworkInterfacesAssignment_22");
			builder.put(grammarAccess.getComputerAccess().getComputerServicesAssignment_24_0(), "rule__Computer__ComputerServicesAssignment_24_0");
			builder.put(grammarAccess.getComputerAccess().getComputerServicesAssignment_24_2_0(), "rule__Computer__ComputerServicesAssignment_24_2_0");
			builder.put(grammarAccess.getComputerAccess().getDeploymentAssignment_25_0(), "rule__Computer__DeploymentAssignment_25_0");
			builder.put(grammarAccess.getDockerDeploymentAccess().getNameAssignment_1(), "rule__DockerDeployment__NameAssignment_1");
			builder.put(grammarAccess.getDockerDeploymentAccess().getDirectoryAssignment_3(), "rule__DockerDeployment__DirectoryAssignment_3");
			builder.put(grammarAccess.getDockerDeploymentAccess().getDeploymentContainersAssignment_6(), "rule__DockerDeployment__DeploymentContainersAssignment_6");
			builder.put(grammarAccess.getDockerDeploymentAccess().getDeploymentContainersAssignment_8_0(), "rule__DockerDeployment__DeploymentContainersAssignment_8_0");
			builder.put(grammarAccess.getNetworkAccess().getNameAssignment_1(), "rule__Network__NameAssignment_1");
			builder.put(grammarAccess.getNetworkAccess().getPrefixAssignment_3(), "rule__Network__PrefixAssignment_3");
			builder.put(grammarAccess.getNetworkAccess().getMaskAssignment_5(), "rule__Network__MaskAssignment_5");
			builder.put(grammarAccess.getNetworkAccess().getGatewayAssignment_7(), "rule__Network__GatewayAssignment_7");
			builder.put(grammarAccess.getNetworkAccess().getDomainNameAssignment_9(), "rule__Network__DomainNameAssignment_9");
			builder.put(grammarAccess.getNetworkAccess().getNetworkInterfacesAssignment_12(), "rule__Network__NetworkInterfacesAssignment_12");
			builder.put(grammarAccess.getNetworkAccess().getNetworkInterfacesAssignment_14_0(), "rule__Network__NetworkInterfacesAssignment_14_0");
			builder.put(grammarAccess.getContainerAccess().getNameAssignment_0(), "rule__Container__NameAssignment_0");
			builder.put(grammarAccess.getContainerAccess().getContainerNetworkInterfaceAssignment_2(), "rule__Container__ContainerNetworkInterfaceAssignment_2");
			builder.put(grammarAccess.getContainerAccess().getContainerServicesAssignment_5(), "rule__Container__ContainerServicesAssignment_5");
			builder.put(grammarAccess.getContainerAccess().getContainerServicesAssignment_7_0(), "rule__Container__ContainerServicesAssignment_7_0");
			builder.put(grammarAccess.getNetworkInterfaceAccess().getNameAssignment_1(), "rule__NetworkInterface__NameAssignment_1");
			builder.put(grammarAccess.getNetworkInterfaceAccess().getIpAddressAssignment_3(), "rule__NetworkInterface__IpAddressAssignment_3");
			builder.put(grammarAccess.getWebServerAccess().getNameAssignment_0(), "rule__WebServer__NameAssignment_0");
			builder.put(grammarAccess.getWebServerAccess().getTypeAssignment_2(), "rule__WebServer__TypeAssignment_2");
			builder.put(grammarAccess.getWebServerAccess().getPortAssignment_4(), "rule__WebServer__PortAssignment_4");
			builder.put(grammarAccess.getWebServerAccess().getProxyAssignment_5_1(), "rule__WebServer__ProxyAssignment_5_1");
			builder.put(grammarAccess.getWebServerAccess().getProxyAssignment_5_2_1(), "rule__WebServer__ProxyAssignment_5_2_1");
			builder.put(grammarAccess.getCalendarScaleAccess().getNameAssignment_1(), "rule__CalendarScale__NameAssignment_1");
			builder.put(grammarAccess.getCalendarScaleAccess().getFactorsAssignment_4(), "rule__CalendarScale__FactorsAssignment_4");
			builder.put(grammarAccess.getCalendarScaleAccess().getPeriodsAssignment_5(), "rule__CalendarScale__PeriodsAssignment_5");
			builder.put(grammarAccess.getCalendarScaleAccess().getFactorsAssignment_6_1(), "rule__CalendarScale__FactorsAssignment_6_1");
			builder.put(grammarAccess.getCalendarScaleAccess().getPeriodsAssignment_6_2(), "rule__CalendarScale__PeriodsAssignment_6_2");
			builder.put(grammarAccess.getFactorScaleAccess().getNameAssignment_1(), "rule__FactorScale__NameAssignment_1");
			builder.put(grammarAccess.getFactorScaleAccess().getFactorAssignment_3(), "rule__FactorScale__FactorAssignment_3");
			builder.put(grammarAccess.getFactorScaleAccess().getZoomsNumberAssignment_5(), "rule__FactorScale__ZoomsNumberAssignment_5");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private DslGrammarAccess grammarAccess;

	@Override
	protected InternalDslParser createParser() {
		InternalDslParser result = new InternalDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}

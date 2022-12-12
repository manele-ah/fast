/*
 * generated by Xtext 2.14.0
 */
package fr.ubo.fast.dsl.serializer;

import com.google.inject.Inject;
import fr.ubo.fast.CalendarScale;
import fr.ubo.fast.Computer;
import fr.ubo.fast.Container;
import fr.ubo.fast.Data;
import fr.ubo.fast.Database;
import fr.ubo.fast.DockerDeployment;
import fr.ubo.fast.FactorScale;
import fr.ubo.fast.FastPackage;
import fr.ubo.fast.File;
import fr.ubo.fast.MeasuredVariable;
import fr.ubo.fast.MetaData;
import fr.ubo.fast.MinMaxVisualizationClient;
import fr.ubo.fast.Network;
import fr.ubo.fast.NetworkInterface;
import fr.ubo.fast.Platform;
import fr.ubo.fast.Sensor;
import fr.ubo.fast.TimeSeries;
import fr.ubo.fast.TimeSeriesFramework;
import fr.ubo.fast.WebServer;
import fr.ubo.fast.dsl.services.DslGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class DslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == FastPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case FastPackage.CALENDAR_SCALE:
				sequence_CalendarScale(context, (CalendarScale) semanticObject); 
				return; 
			case FastPackage.COMPUTER:
				sequence_Computer(context, (Computer) semanticObject); 
				return; 
			case FastPackage.CONTAINER:
				sequence_Container(context, (Container) semanticObject); 
				return; 
			case FastPackage.DATA:
				sequence_Data(context, (Data) semanticObject); 
				return; 
			case FastPackage.DATABASE:
				sequence_Database(context, (Database) semanticObject); 
				return; 
			case FastPackage.DOCKER_DEPLOYMENT:
				sequence_DockerDeployment(context, (DockerDeployment) semanticObject); 
				return; 
			case FastPackage.FACTOR_SCALE:
				sequence_FactorScale(context, (FactorScale) semanticObject); 
				return; 
			case FastPackage.FILE:
				sequence_File(context, (File) semanticObject); 
				return; 
			case FastPackage.MEASURED_VARIABLE:
				sequence_MeasuredVariable(context, (MeasuredVariable) semanticObject); 
				return; 
			case FastPackage.META_DATA:
				sequence_MetaData(context, (MetaData) semanticObject); 
				return; 
			case FastPackage.MIN_MAX_VISUALIZATION_CLIENT:
				sequence_MinMaxVisualizationClient(context, (MinMaxVisualizationClient) semanticObject); 
				return; 
			case FastPackage.NETWORK:
				sequence_Network(context, (Network) semanticObject); 
				return; 
			case FastPackage.NETWORK_INTERFACE:
				sequence_NetworkInterface(context, (NetworkInterface) semanticObject); 
				return; 
			case FastPackage.PLATFORM:
				sequence_Platform(context, (Platform) semanticObject); 
				return; 
			case FastPackage.SENSOR:
				sequence_Sensor(context, (Sensor) semanticObject); 
				return; 
			case FastPackage.TIME_SERIES:
				sequence_TimeSeries(context, (TimeSeries) semanticObject); 
				return; 
			case FastPackage.TIME_SERIES_FRAMEWORK:
				sequence_TimeSeriesFramework(context, (TimeSeriesFramework) semanticObject); 
				return; 
			case FastPackage.WEB_SERVER:
				sequence_WebServer(context, (WebServer) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Scale returns CalendarScale
	 *     CalendarScale returns CalendarScale
	 *
	 * Constraint:
	 *     (name=EString factors+=ELong periods+=Period (factors+=ELong periods+=Period)*)
	 */
	protected void sequence_CalendarScale(ISerializationContext context, CalendarScale semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Computer returns Computer
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         os=OSType 
	 *         ramMemory=EInt 
	 *         storageMemory=EInt 
	 *         cpuNumber=EInt 
	 *         cpuCoresNumber=EInt 
	 *         cpuFrequency=EInt 
	 *         username=EString 
	 *         password=EString 
	 *         computerNetworkInterfaces+=[NetworkInterface|EString] 
	 *         computerNetworkInterfaces+=[NetworkInterface|EString]* 
	 *         (computerServices+=Service computerServices+=Service*)? 
	 *         deployment=DockerDeployment?
	 *     )
	 */
	protected void sequence_Computer(ISerializationContext context, Computer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Container returns Container
	 *
	 * Constraint:
	 *     (name=EString containerNetworkInterface=[NetworkInterface|EString] containerServices+=Service containerServices+=Service*)
	 */
	protected void sequence_Container(ISerializationContext context, Container semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Data returns Data
	 *
	 * Constraint:
	 *     (sensorsData+=Sensor sensorsData+=Sensor* timeSeriesData+=TimeSeries timeSeriesData+=TimeSeries*)
	 */
	protected void sequence_Data(ISerializationContext context, Data semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataSource returns Database
	 *     Service returns Database
	 *     Database returns Database
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         dbms=DatabaseType 
	 *         port=EInt 
	 *         username=EString 
	 *         password=EString 
	 *         dataDirectory=EString
	 *     )
	 */
	protected void sequence_Database(ISerializationContext context, Database semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FastPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, FastPackage.Literals.DATABASE__DBMS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastPackage.Literals.DATABASE__DBMS));
			if (transientValues.isValueTransient(semanticObject, FastPackage.Literals.DATABASE__PORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastPackage.Literals.DATABASE__PORT));
			if (transientValues.isValueTransient(semanticObject, FastPackage.Literals.DATABASE__USERNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastPackage.Literals.DATABASE__USERNAME));
			if (transientValues.isValueTransient(semanticObject, FastPackage.Literals.DATABASE__PASSWORD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastPackage.Literals.DATABASE__PASSWORD));
			if (transientValues.isValueTransient(semanticObject, FastPackage.Literals.DATABASE__DATA_DIRECTORY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastPackage.Literals.DATABASE__DATA_DIRECTORY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDatabaseAccess().getNameEStringParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDatabaseAccess().getDbmsDatabaseTypeEnumRuleCall_2_0(), semanticObject.getDbms());
		feeder.accept(grammarAccess.getDatabaseAccess().getPortEIntParserRuleCall_4_0(), semanticObject.getPort());
		feeder.accept(grammarAccess.getDatabaseAccess().getUsernameEStringParserRuleCall_6_0(), semanticObject.getUsername());
		feeder.accept(grammarAccess.getDatabaseAccess().getPasswordEStringParserRuleCall_8_0(), semanticObject.getPassword());
		feeder.accept(grammarAccess.getDatabaseAccess().getDataDirectoryEStringParserRuleCall_10_0(), semanticObject.getDataDirectory());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DockerDeployment returns DockerDeployment
	 *
	 * Constraint:
	 *     (name=EString directory=EString deploymentContainers+=Container deploymentContainers+=Container*)
	 */
	protected void sequence_DockerDeployment(ISerializationContext context, DockerDeployment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Scale returns FactorScale
	 *     FactorScale returns FactorScale
	 *
	 * Constraint:
	 *     (name=EString factor=EInt zoomsNumber=EInt)
	 */
	protected void sequence_FactorScale(ISerializationContext context, FactorScale semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FastPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, FastPackage.Literals.FACTOR_SCALE__FACTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastPackage.Literals.FACTOR_SCALE__FACTOR));
			if (transientValues.isValueTransient(semanticObject, FastPackage.Literals.FACTOR_SCALE__ZOOMS_NUMBER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastPackage.Literals.FACTOR_SCALE__ZOOMS_NUMBER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFactorScaleAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFactorScaleAccess().getFactorEIntParserRuleCall_3_0(), semanticObject.getFactor());
		feeder.accept(grammarAccess.getFactorScaleAccess().getZoomsNumberEIntParserRuleCall_5_0(), semanticObject.getZoomsNumber());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DataSource returns File
	 *     Service returns File
	 *     File returns File
	 *
	 * Constraint:
	 *     (name=EString path=EString)
	 */
	protected void sequence_File(ISerializationContext context, File semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FastPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, FastPackage.Literals.FILE__PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastPackage.Literals.FILE__PATH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFileAccess().getNameEStringParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFileAccess().getPathEStringParserRuleCall_2_0(), semanticObject.getPath());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MeasuredVariable returns MeasuredVariable
	 *
	 * Constraint:
	 *     (name=EString unit=MeasurementDataUnit (measuredVariableMetaData+=MetaData measuredVariableMetaData+=MetaData*)?)
	 */
	protected void sequence_MeasuredVariable(ISerializationContext context, MeasuredVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MetaData returns MetaData
	 *
	 * Constraint:
	 *     (name=EString value=EString)
	 */
	protected void sequence_MetaData(ISerializationContext context, MetaData semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FastPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, FastPackage.Literals.META_DATA__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastPackage.Literals.META_DATA__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMetaDataAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMetaDataAccess().getValueEStringParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VisualizationClient returns MinMaxVisualizationClient
	 *     MinMaxVisualizationClient returns MinMaxVisualizationClient
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         timeSeriesSelected=[TimeSeries|EString] 
	 *         clientComputer=[Computer|EString] 
	 *         chartWidth=EInt 
	 *         chartHeight=EInt 
	 *         axisFactor=EInt 
	 *         userPolicy=UserPolicy 
	 *         clientScale=Scale 
	 *         userTime=EDouble 
	 *         pingTime=EDouble 
	 *         rawDataThreshold=EDouble 
	 *         preComputedDataThreshold=EDouble
	 *     )
	 */
	protected void sequence_MinMaxVisualizationClient(ISerializationContext context, MinMaxVisualizationClient semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FastPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, FastPackage.Literals.MIN_MAX_VISUALIZATION_CLIENT__TIME_SERIES_SELECTED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastPackage.Literals.MIN_MAX_VISUALIZATION_CLIENT__TIME_SERIES_SELECTED));
			if (transientValues.isValueTransient(semanticObject, FastPackage.Literals.MIN_MAX_VISUALIZATION_CLIENT__CLIENT_COMPUTER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastPackage.Literals.MIN_MAX_VISUALIZATION_CLIENT__CLIENT_COMPUTER));
			if (transientValues.isValueTransient(semanticObject, FastPackage.Literals.MIN_MAX_VISUALIZATION_CLIENT__CHART_WIDTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastPackage.Literals.MIN_MAX_VISUALIZATION_CLIENT__CHART_WIDTH));
			if (transientValues.isValueTransient(semanticObject, FastPackage.Literals.MIN_MAX_VISUALIZATION_CLIENT__CHART_HEIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastPackage.Literals.MIN_MAX_VISUALIZATION_CLIENT__CHART_HEIGHT));
			if (transientValues.isValueTransient(semanticObject, FastPackage.Literals.MIN_MAX_VISUALIZATION_CLIENT__AXIS_FACTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastPackage.Literals.MIN_MAX_VISUALIZATION_CLIENT__AXIS_FACTOR));
			if (transientValues.isValueTransient(semanticObject, FastPackage.Literals.MIN_MAX_VISUALIZATION_CLIENT__USER_POLICY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastPackage.Literals.MIN_MAX_VISUALIZATION_CLIENT__USER_POLICY));
			if (transientValues.isValueTransient(semanticObject, FastPackage.Literals.MIN_MAX_VISUALIZATION_CLIENT__CLIENT_SCALE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastPackage.Literals.MIN_MAX_VISUALIZATION_CLIENT__CLIENT_SCALE));
			if (transientValues.isValueTransient(semanticObject, FastPackage.Literals.MIN_MAX_VISUALIZATION_CLIENT__USER_TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastPackage.Literals.MIN_MAX_VISUALIZATION_CLIENT__USER_TIME));
			if (transientValues.isValueTransient(semanticObject, FastPackage.Literals.MIN_MAX_VISUALIZATION_CLIENT__PING_TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastPackage.Literals.MIN_MAX_VISUALIZATION_CLIENT__PING_TIME));
			if (transientValues.isValueTransient(semanticObject, FastPackage.Literals.MIN_MAX_VISUALIZATION_CLIENT__RAW_DATA_THRESHOLD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastPackage.Literals.MIN_MAX_VISUALIZATION_CLIENT__RAW_DATA_THRESHOLD));
			if (transientValues.isValueTransient(semanticObject, FastPackage.Literals.MIN_MAX_VISUALIZATION_CLIENT__PRE_COMPUTED_DATA_THRESHOLD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastPackage.Literals.MIN_MAX_VISUALIZATION_CLIENT__PRE_COMPUTED_DATA_THRESHOLD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMinMaxVisualizationClientAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMinMaxVisualizationClientAccess().getTimeSeriesSelectedTimeSeriesEStringParserRuleCall_3_0_1(), semanticObject.eGet(FastPackage.Literals.MIN_MAX_VISUALIZATION_CLIENT__TIME_SERIES_SELECTED, false));
		feeder.accept(grammarAccess.getMinMaxVisualizationClientAccess().getClientComputerComputerEStringParserRuleCall_5_0_1(), semanticObject.eGet(FastPackage.Literals.MIN_MAX_VISUALIZATION_CLIENT__CLIENT_COMPUTER, false));
		feeder.accept(grammarAccess.getMinMaxVisualizationClientAccess().getChartWidthEIntParserRuleCall_7_0(), semanticObject.getChartWidth());
		feeder.accept(grammarAccess.getMinMaxVisualizationClientAccess().getChartHeightEIntParserRuleCall_9_0(), semanticObject.getChartHeight());
		feeder.accept(grammarAccess.getMinMaxVisualizationClientAccess().getAxisFactorEIntParserRuleCall_11_0(), semanticObject.getAxisFactor());
		feeder.accept(grammarAccess.getMinMaxVisualizationClientAccess().getUserPolicyUserPolicyEnumRuleCall_14_0(), semanticObject.getUserPolicy());
		feeder.accept(grammarAccess.getMinMaxVisualizationClientAccess().getClientScaleScaleParserRuleCall_16_0(), semanticObject.getClientScale());
		feeder.accept(grammarAccess.getMinMaxVisualizationClientAccess().getUserTimeEDoubleParserRuleCall_19_0(), semanticObject.getUserTime());
		feeder.accept(grammarAccess.getMinMaxVisualizationClientAccess().getPingTimeEDoubleParserRuleCall_22_0(), semanticObject.getPingTime());
		feeder.accept(grammarAccess.getMinMaxVisualizationClientAccess().getRawDataThresholdEDoubleParserRuleCall_25_0(), semanticObject.getRawDataThreshold());
		feeder.accept(grammarAccess.getMinMaxVisualizationClientAccess().getPreComputedDataThresholdEDoubleParserRuleCall_28_0(), semanticObject.getPreComputedDataThreshold());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     NetworkInterface returns NetworkInterface
	 *
	 * Constraint:
	 *     (name=EString ipAddress=EString)
	 */
	protected void sequence_NetworkInterface(ISerializationContext context, NetworkInterface semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FastPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, FastPackage.Literals.NETWORK_INTERFACE__IP_ADDRESS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastPackage.Literals.NETWORK_INTERFACE__IP_ADDRESS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNetworkInterfaceAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getNetworkInterfaceAccess().getIpAddressEStringParserRuleCall_3_0(), semanticObject.getIpAddress());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Network returns Network
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         prefix=EString 
	 *         mask=EString 
	 *         gateway=EString 
	 *         domainName=EString 
	 *         networkInterfaces+=NetworkInterface 
	 *         networkInterfaces+=NetworkInterface*
	 *     )
	 */
	protected void sequence_Network(ISerializationContext context, Network semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Platform returns Platform
	 *
	 * Constraint:
	 *     (computersPlatform+=Computer computersPlatform+=Computer* networksPlatform+=Network networksPlatform+=Network*)
	 */
	protected void sequence_Platform(ISerializationContext context, Platform semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Sensor returns Sensor
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (sensorMetaData+=MetaData sensorMetaData+=MetaData*)? 
	 *         sensorMeasuredVariables+=MeasuredVariable 
	 *         sensorMeasuredVariables+=MeasuredVariable*
	 *     )
	 */
	protected void sequence_Sensor(ISerializationContext context, Sensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TimeSeriesFramework returns TimeSeriesFramework
	 *
	 * Constraint:
	 *     (platform=Platform data=Data clients+=VisualizationClient clients+=VisualizationClient*)
	 */
	protected void sequence_TimeSeriesFramework(ISerializationContext context, TimeSeriesFramework semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TimeSeries returns TimeSeries
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         timeSeriesMeasuredVariable=[MeasuredVariable|EString] 
	 *         startTime=EString 
	 *         endTime=EString 
	 *         period=EDouble 
	 *         timeSeriesDataSource=[DataSource|EString]
	 *     )
	 */
	protected void sequence_TimeSeries(ISerializationContext context, TimeSeries semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FastPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, FastPackage.Literals.TIME_SERIES__TIME_SERIES_MEASURED_VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastPackage.Literals.TIME_SERIES__TIME_SERIES_MEASURED_VARIABLE));
			if (transientValues.isValueTransient(semanticObject, FastPackage.Literals.TIME_SERIES__START_TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastPackage.Literals.TIME_SERIES__START_TIME));
			if (transientValues.isValueTransient(semanticObject, FastPackage.Literals.TIME_SERIES__END_TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastPackage.Literals.TIME_SERIES__END_TIME));
			if (transientValues.isValueTransient(semanticObject, FastPackage.Literals.TIME_SERIES__PERIOD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastPackage.Literals.TIME_SERIES__PERIOD));
			if (transientValues.isValueTransient(semanticObject, FastPackage.Literals.TIME_SERIES__TIME_SERIES_DATA_SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastPackage.Literals.TIME_SERIES__TIME_SERIES_DATA_SOURCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTimeSeriesAccess().getNameEStringParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTimeSeriesAccess().getTimeSeriesMeasuredVariableMeasuredVariableEStringParserRuleCall_2_0_1(), semanticObject.eGet(FastPackage.Literals.TIME_SERIES__TIME_SERIES_MEASURED_VARIABLE, false));
		feeder.accept(grammarAccess.getTimeSeriesAccess().getStartTimeEStringParserRuleCall_6_0(), semanticObject.getStartTime());
		feeder.accept(grammarAccess.getTimeSeriesAccess().getEndTimeEStringParserRuleCall_9_0(), semanticObject.getEndTime());
		feeder.accept(grammarAccess.getTimeSeriesAccess().getPeriodEDoubleParserRuleCall_12_0(), semanticObject.getPeriod());
		feeder.accept(grammarAccess.getTimeSeriesAccess().getTimeSeriesDataSourceDataSourceEStringParserRuleCall_15_0_1(), semanticObject.eGet(FastPackage.Literals.TIME_SERIES__TIME_SERIES_DATA_SOURCE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Service returns WebServer
	 *     WebServer returns WebServer
	 *
	 * Constraint:
	 *     (name=EString type=WebServerType port=EInt (proxy+=[DataSource|EString] proxy+=[DataSource|EString]*)?)
	 */
	protected void sequence_WebServer(ISerializationContext context, WebServer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
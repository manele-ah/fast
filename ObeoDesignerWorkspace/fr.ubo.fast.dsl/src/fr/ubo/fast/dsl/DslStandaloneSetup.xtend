/*
 * generated by Xtext 2.14.0
 */
package fr.ubo.fast.dsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class DslStandaloneSetup extends DslStandaloneSetupGenerated
{
	def static void doSetup()
	{
		new DslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}

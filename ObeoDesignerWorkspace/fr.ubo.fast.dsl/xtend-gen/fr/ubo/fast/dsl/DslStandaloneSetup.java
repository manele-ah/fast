/**
 * generated by Xtext 2.14.0
 */
package fr.ubo.fast.dsl;

import fr.ubo.fast.dsl.DslStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class DslStandaloneSetup extends DslStandaloneSetupGenerated {
  public static void doSetup() {
    new DslStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}

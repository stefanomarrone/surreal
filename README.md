# surreal
SURvivability Requirements Elicitation and Assessment tooL

Repository structure:
- Common
- Profile

  - **provaSurvivabilityProfile**: Papyrus *model* project with running example with the profile application
  - **SurvivabilityProfile**: Papyrus *profile* project with the profile definition
  
- SAMGenerator: Eclipse project of the SAM Generator. The structure follows the classical Eclipse Java project. In particular:
  - **SAMGenerator/src**: Java classes implementing the SAMGenerator
  - **SAMGenerator/model**: SableCC grammars supporting the interpretation of the global modes definitions as weel as the NuSMV results

- Repositories
- Solution Engine
  - **SolutionEngine/src**: Java classes implementing the Solution Engine
  - **SolutionEngine/dynamic**: a Java class containing the definition of a Fake Solver as an implementation of the Solver interface (see ../src)
  - **SolutionEngine/lib**: libraries needed by the application
  - **SolutionEngine/test**: a testing main Java file
  - **SolutionEngine/run**: configuration ini file and a jar containing a fake solver to test the mechanism

- Eclipse plugins
  - **Profile/org.surreal.SurvivabilityProfile**: Eclipse *plugin* project of the Survivability Profile
  - **Gui/org.surreal.SurvivabilityPropertiesGui**: Eclipe *plugin* project of the Gui for the selection of surv. properties

Wiki: detailed explanation for the usage of the tool

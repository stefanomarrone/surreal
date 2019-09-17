# surreal
SURvivability Requirements Elicitation and Assessment tooL

## Repository structure:
- plugins: ready-to-use jar to put in the dropins folder in order to use the Surreal framework

- Profile
  - **provaSurvivabilityProfile**: Papyrus *model* project with running example with the profile application
  - **SurvivabilityProfile**: Papyrus *profile* project with the profile definition
  
- repository: folder containing the content and the structure of a JSON repository implemeting the Query Template Repository
  - **htdocs/repository.json**: JSON description of the repository
  - **htdocs/ReversibilitySolver.jar**: Jar implmeneting the P1 query template solver
  - **htdocs/MultipleThreatImpactSolver.jar**: Jar implmeneting the P8 query template solver
  - **htdocs/BestStrategySolver.jar**: Jar implmeneting the P14 query template solver
  - **run_docker.sh**: bash script file running a Docker container running a web server

- Eclipse plugins
  - **Profile/org.surreal.SurvivabilityProfile**: Eclipse *plugin* project of the Survivability Profile
  - **Surreal/**: Eclipse *plugin* project SAM Generation and Query Instantiation
  - **Surreal_solvers/**: Eclipse projects related to the three implemented solvers
  - **Gui/org.surreal.SurvivabilityPropertiesGui**: Eclipe *plugin* project of the Gui for the selection of surv. properties

## Framework usage:
### prerequisites:
  - docker
  - NuSMV
  - a version of Eclipse with modeling tools installed (the project has been developer under Oxygen but Photon works as well). You can install all the modeling tools by checking all the Modeling section from "Install New Software"

### setting:
  - extract from this repository, the two plugins in the *dropins* folder
  - open the org.surreal_**.jar file and edit the *configuration.ini* file under the *configuration* folder
	  - keep *kind=json*
	  - change the *url* value if you don't wnat to use the embedded docker web server (in this case, write down the url of the server you want to use)
	  - in case you have not a NuSMV tool that can be launched from the command line independently from the folder you stay in, report in the *tool* entry the absolute path and the name of the NuSMV tool
  - save and close the jar and put both the plugin files into the dropinf folder of your Eclipse environment.

### usage:
  - open your Eclipse environment as prepared before
  - create a generic Eclipse project
  - add a Survivability Profile conformant UML model (MUCD) to the project
  - select the model
  - press the *SAM* button you see on the toolbar or select *SAM Generation*. The process will generate another uml model with a *_out* suffix before the *uml* extension containing the Survivability Assessment Model
  - select SAM model
  - press the *QRY* button you see on the toolbar or select *Query Instancer*. The process will open the Query Instantioation GUI through which you can check and analyse the query templates you want
  - when the *Check* button is pressed, the queries are analysed, the GUI is hidden and the results are available on the console in the calling Eclipse environment











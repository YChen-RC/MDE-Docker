/**
 * generated by Xtext 2.30.0
 */
package org.xtext.example.mydocker.myDocker.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydocker.myDocker.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDockerFactoryImpl extends EFactoryImpl implements MyDockerFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyDockerFactory init()
  {
    try
    {
      MyDockerFactory theMyDockerFactory = (MyDockerFactory)EPackage.Registry.INSTANCE.getEFactory(MyDockerPackage.eNS_URI);
      if (theMyDockerFactory != null)
      {
        return theMyDockerFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyDockerFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDockerFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MyDockerPackage.DOCKER: return createDocker();
      case MyDockerPackage.COMMAND: return createCommand();
      case MyDockerPackage.ADD: return createAdd();
      case MyDockerPackage.ARG: return createArg();
      case MyDockerPackage.CMD: return createCmd();
      case MyDockerPackage.COPY: return createCopy();
      case MyDockerPackage.ENTRYPOINT: return createEntrypoint();
      case MyDockerPackage.ENV: return createEnv();
      case MyDockerPackage.EXPOSE: return createExpose();
      case MyDockerPackage.FROM: return createFrom();
      case MyDockerPackage.HEALTHCHECK: return createHealthcheck();
      case MyDockerPackage.LABEL: return createLabel();
      case MyDockerPackage.MAINTAINER: return createMaintainer();
      case MyDockerPackage.ONBUILD: return createOnbuild();
      case MyDockerPackage.RUN: return createRun();
      case MyDockerPackage.SHELL: return createShell();
      case MyDockerPackage.STOP_SIGNAL: return createStopSignal();
      case MyDockerPackage.USER: return createUser();
      case MyDockerPackage.VOLUME: return createVolume();
      case MyDockerPackage.WORKDIR: return createWorkdir();
      case MyDockerPackage.COMMAND_ARGS: return createCommandArgs();
      case MyDockerPackage.JSON_ARGS: return createJSONArgs();
      case MyDockerPackage.NAME_VALS: return createNameVals();
      case MyDockerPackage.NAME_VAL: return createNameVal();
      case MyDockerPackage.ARG_ARGS: return createArgArgs();
      case MyDockerPackage.HEALTH_ARGS: return createHealthArgs();
      case MyDockerPackage.OPTIONS: return createOptions();
      case MyDockerPackage.OPTION: return createOption();
      case MyDockerPackage.EXPOSE_ARGS: return createExposeArgs();
      case MyDockerPackage.EXPOSE_ARG: return createExposeArg();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Docker createDocker()
  {
    DockerImpl docker = new DockerImpl();
    return docker;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Command createCommand()
  {
    CommandImpl command = new CommandImpl();
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Add createAdd()
  {
    AddImpl add = new AddImpl();
    return add;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Arg createArg()
  {
    ArgImpl arg = new ArgImpl();
    return arg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Cmd createCmd()
  {
    CmdImpl cmd = new CmdImpl();
    return cmd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Copy createCopy()
  {
    CopyImpl copy = new CopyImpl();
    return copy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Entrypoint createEntrypoint()
  {
    EntrypointImpl entrypoint = new EntrypointImpl();
    return entrypoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Env createEnv()
  {
    EnvImpl env = new EnvImpl();
    return env;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expose createExpose()
  {
    ExposeImpl expose = new ExposeImpl();
    return expose;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public From createFrom()
  {
    FromImpl from = new FromImpl();
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Healthcheck createHealthcheck()
  {
    HealthcheckImpl healthcheck = new HealthcheckImpl();
    return healthcheck;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Label createLabel()
  {
    LabelImpl label = new LabelImpl();
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Maintainer createMaintainer()
  {
    MaintainerImpl maintainer = new MaintainerImpl();
    return maintainer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Onbuild createOnbuild()
  {
    OnbuildImpl onbuild = new OnbuildImpl();
    return onbuild;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Run createRun()
  {
    RunImpl run = new RunImpl();
    return run;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Shell createShell()
  {
    ShellImpl shell = new ShellImpl();
    return shell;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StopSignal createStopSignal()
  {
    StopSignalImpl stopSignal = new StopSignalImpl();
    return stopSignal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public User createUser()
  {
    UserImpl user = new UserImpl();
    return user;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Volume createVolume()
  {
    VolumeImpl volume = new VolumeImpl();
    return volume;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Workdir createWorkdir()
  {
    WorkdirImpl workdir = new WorkdirImpl();
    return workdir;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CommandArgs createCommandArgs()
  {
    CommandArgsImpl commandArgs = new CommandArgsImpl();
    return commandArgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JSONArgs createJSONArgs()
  {
    JSONArgsImpl jsonArgs = new JSONArgsImpl();
    return jsonArgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NameVals createNameVals()
  {
    NameValsImpl nameVals = new NameValsImpl();
    return nameVals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NameVal createNameVal()
  {
    NameValImpl nameVal = new NameValImpl();
    return nameVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArgArgs createArgArgs()
  {
    ArgArgsImpl argArgs = new ArgArgsImpl();
    return argArgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public HealthArgs createHealthArgs()
  {
    HealthArgsImpl healthArgs = new HealthArgsImpl();
    return healthArgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Options createOptions()
  {
    OptionsImpl options = new OptionsImpl();
    return options;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Option createOption()
  {
    OptionImpl option = new OptionImpl();
    return option;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExposeArgs createExposeArgs()
  {
    ExposeArgsImpl exposeArgs = new ExposeArgsImpl();
    return exposeArgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExposeArg createExposeArg()
  {
    ExposeArgImpl exposeArg = new ExposeArgImpl();
    return exposeArg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MyDockerPackage getMyDockerPackage()
  {
    return (MyDockerPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyDockerPackage getPackage()
  {
    return MyDockerPackage.eINSTANCE;
  }

} //MyDockerFactoryImpl

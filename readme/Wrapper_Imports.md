# .

## Native C++ Libraries.
### LIB_LaunchEnableForConcurrentThreadsAt_CLIENT.dll.
#### Header.
````
#ifdef LAUNCHENABLEFORCONCURRENTTHREADSATCLIENT_EXPORTS
#define LAUNCHENABLEFORCONCURRENTTHREADSATCLIENT_API __declspec(dllexport)
#else
#define LAUNCHENABLEFORCONCURRENTTHREADSATCLIENT_API __declspec(dllimport)
#endif
extern "C"
{
	namespace OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT
	{
		class LAUNCHENABLEFORCONCURRENTTHREADSATCLIENT_API CLIBLaunchEnableForConcurrentThreadsAtCLIENT
		{
		public:
			static void* app_FUNCT_generate_Program();
			static void app_FUNCT_request_Wait_launch(void* obj, unsigned char* bytes);
			static void app_FUNCT_terminate_Progaram();
			static void app_FUNCT_thread_End(void* obj, unsigned char* bytes);
			static unsigned char* app_FUNCT_get_coreId_To_launch(void* obj);
			static bool app_FUNCT_get_Flag_Active(void* obj);
			static bool app_FUNCT_get_Flag_ConcurrentCoreState(void* obj, unsigned char* bytes);
			static bool app_FUNCT_get_Flag_Idle(void* obj);
			static bool app_FUNCT_get_State_launchBit(void* obj);
			static void app_FUNCT_set_Flag_ConcurrentCoreState(void* obj, unsigned char* bytes, bool newValue);

		private:
			static void stat_boot1_CLASS_DEFINE_LaunchEnableForConcurrentThreadsAt_CLIENT_Framework();
			static void stat_boot3_CLASS_INITIALISE_LaunchEnableForConcurrentThreadsAt_CLIENT_Framework();
			static class LaunchEnableForConcurrentThreadsAt_CLIENT_Framework* stat_CLASS_get_ptr_LaunchEnableForConcurrentThreadsAt_CLIENT_Framework();
		};
	}
}
````
#### Source.
````
#include "pch.h"
#include "framework.h"
#include "LIB_WriteEnableForThreadsAt_CLIENTINPUTACTION.h"
class OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::WriteEnableForThreadsAt_CLIENTINPUTACTION_Framework* _ptr_Framework_WriteEnableForThreadsAt_CLIENTINPUTACTION;
void* OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::CLIBWriteEnableForThreadsAtCLIENTINPUTACTION::app_FUNCT_generate_Program()
{
	std::cout << "started Classes - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE." << std::endl;
	stat_boot1_CLASS_DEFINE_Framework();
	stat_boot3_CLASS_INITIALISE_Framework();
	std::cout << "done Classes - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE." << std::endl;

	std::cout << "started Registers - DEFINE" << std::endl;
	stat_CLASS_get_ptr_Framework()->boot1_REG_DEFINE_WriteEnableForThreadsAt_CLIENTINPUTACTION_Framework(stat_CLASS_get_ptr_Framework());
	std::cout << "done Registers - DEFINE." << std::endl;

	std::cout << "started Registers - SUBSTANTIATE." << std::endl;
	stat_CLASS_get_ptr_Framework()->boot2_REG_SUBSTANTIATE_WriteEnableForThreadsAt_CLIENTINPUTACTION_Framework(stat_CLASS_get_ptr_Framework());
	std::cout << "done Registers - SUBSTANTIATE." << std::endl;

	std::cout << "started Registers - INITIALISE." << std::endl;
	stat_CLASS_get_ptr_Framework()->boot3_REG_INITIALISE_WriteEnableForThreadsAt_CLIENTINPUTACTION_Framework(stat_CLASS_get_ptr_Framework());
	std::cout << "done Registers - INITIALISE." << std::endl;

	std::cout << "started Program - INSTANTIATE." << std::endl;
	stat_CLASS_get_ptr_Framework()->boot4_PGM_INSTANTIATE_WriteEnableForThreadsAt_CLIENTINPUTACTION_Framework(stat_CLASS_get_ptr_Framework());
	std::cout << "done Program - INSTANTIATE." << std::endl;
	
	std::cout << "" << std::endl;
	std::cout << "        ,     \\      /      ," << std::endl;
	std::cout << "        ,     \\      /      ," << std::endl;
	std::cout << "       / \\    )\\ __ /(     / \\ " << std::endl;
	std::cout << "      /   \\   (_\\  /_)    /   \\ " << std::endl;
	std::cout << "____ / ____\\__ \\@  @/ ___/_____\\_____" << std::endl;
	std::cout << "|              |\\../|               |" << std::endl;
	std::cout << "|               \\VV/                |" << std::endl;
	std::cout << "|        MIT Write Que .dll         |" << std::endl;
	std::cout << "|___________________________________|" << std::endl;
	std::cout << "|    / \\ /        \\\\        \\ /\\    |" << std::endl;
	std::cout << "|  /    V          ))        V   \\  |" << std::endl;
	std::cout << "|/                //               \\| " << std::endl;
	std::cout << "`                 V                 '" << std::endl;
	std::cout << "" << std::endl;
	return (void*)stat_CLASS_get_ptr_Framework();
}
void OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::CLIBWriteEnableForThreadsAtCLIENTINPUTACTION::app_FUNCT_terminate_Program()
{
	delete _ptr_Framework_WriteEnableForThreadsAt_CLIENTINPUTACTION;
	while (stat_CLASS_get_ptr_Framework() != NULL) {}
}
void OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::CLIBWriteEnableForThreadsAtCLIENTINPUTACTION::app_FUNCT_write_End(void* obj, unsigned char* bytes)
{
	OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::WriteEnableForThreadsAt_CLIENTINPUTACTION_Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_WriteEnable()->dyn_app_FUNCT_write_End(OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::WriteEnableForThreadsAt_CLIENTINPUTACTION_Global::stat_CONVERT_ObjPtr_to_Class(obj), OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::WriteEnableForThreadsAt_CLIENTINPUTACTION_Global::stat_CONVERT_ByteArray_to_uint8_t(bytes));
}
void OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::CLIBWriteEnableForThreadsAtCLIENTINPUTACTION::app_FUNCT_write_Start(void* obj, unsigned char* bytes)
{
	OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::WriteEnableForThreadsAt_CLIENTINPUTACTION_Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_WriteEnable()->dyn_app_FUNCT_write_Start(OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::WriteEnableForThreadsAt_CLIENTINPUTACTION_Global::stat_CONVERT_ObjPtr_to_Class(obj), OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::WriteEnableForThreadsAt_CLIENTINPUTACTION_Global::stat_CONVERT_ByteArray_to_uint8_t(bytes));
}
void OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::CLIBWriteEnableForThreadsAtCLIENTINPUTACTION::stat_boot1_CLASS_DEFINE_Framework()
{
	_ptr_Framework_WriteEnableForThreadsAt_CLIENTINPUTACTION = NULL;
}
void OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::CLIBWriteEnableForThreadsAtCLIENTINPUTACTION::stat_boot3_CLASS_INITIALISE_Framework()
{
	_ptr_Framework_WriteEnableForThreadsAt_CLIENTINPUTACTION = new class OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::WriteEnableForThreadsAt_CLIENTINPUTACTION_Framework();
	while (stat_CLASS_get_ptr_Framework() == NULL) {}
}
OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::WriteEnableForThreadsAt_CLIENTINPUTACTION_Framework* OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::CLIBWriteEnableForThreadsAtCLIENTINPUTACTION::stat_CLASS_get_ptr_Framework()
{
	return _ptr_Framework_WriteEnableForThreadsAt_CLIENTINPUTACTION;
}
````

### LIB_LaunchEnableForConcurrentThreadsAt_SERVER.dll.
#### Header.
````
#ifdef LAUNCHENABLEFORCONCURRENTTHREADSATSERVER_EXPORTS
#define LAUNCHENABLEFORCONCURRENTTHREADSATSERVER_API __declspec(dllexport)
#else
#define LAUNCHENABLEFORCONCURRENTTHREADSATSERVER_API __declspec(dllimport)
#endif
extern "C"
{
	namespace OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtSERVER
	{
		class LAUNCHENABLEFORCONCURRENTTHREADSATSERVER_API CLIBLaunchEnableForConcurrentThreadsAtSERVER
		{
		public:
			static void* app_FUNCT_generate_Program();
			static void app_FUNCT_request_Wait_launch(void* obj, unsigned char* bytes);
			static void app_FUNCT_terminate_Progaram();
			static void app_FUNCT_thread_End(void* obj, unsigned char* bytes);
			static unsigned char* app_FUNCT_get_coreId_To_launch(void* obj);
			static bool app_FUNCT_get_Flag_Active(void* obj);
			static bool app_FUNCT_get_Flag_ConcurrentCoreState(void* obj, unsigned char* bytes);
			static bool app_FUNCT_get_Flag_Idle(void* obj);
			static bool app_FUNCT_get_State_launchBit(void* obj);
			static void app_FUNCT_set_Flag_ConcurrentCoreState(void* obj, unsigned char* bytes, bool newValue);

		private:
			static void stat_boot1_CLASS_DEFINE_LaunchEnableForConcurrentThreadsAt_SERVER_Framework();
			static void stat_boot3_CLASS_INITIALISE_LaunchEnableForConcurrentThreadsAt_SERVER_Framework();
			static class LaunchEnableForConcurrentThreadsAt_SERVER_Framework* stat_CLASS_get_ptr_LaunchEnableForConcurrentThreadsAt_SERVER_Framework();
		};
	}
}
````
#### Source.
````
#include "pch.h"
#include "framework.h"
#include "LIB_LaunchEnableForConcurrentThreadsAt_SERVER.h"
class OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtSERVER::LaunchEnableForConcurrentThreadsAt_SERVER_Framework* _ptr_Framework_LaunchEnableForConcurrentThreadsAt_SERVER;
void* OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtSERVER::CLIBLaunchEnableForConcurrentThreadsAtSERVER::app_FUNCT_generate_Program()
{
    std::cout << "started Classes - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE." << std::endl;
    stat_boot1_CLASS_DEFINE_LaunchEnableForConcurrentThreadsAt_SERVER_Framework();
    stat_boot3_CLASS_INITIALISE_LaunchEnableForConcurrentThreadsAt_SERVER_Framework();
    std::cout << "done Classes - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE." << std::endl;

    std::cout << "started Registers - DEFINE" << std::endl;
    stat_CLASS_get_ptr_LaunchEnableForConcurrentThreadsAt_SERVER_Framework()->boot1_REG_DEFINE_LaunchEnableForConcurrentThreadsAt_SERVER_Framework(stat_CLASS_get_ptr_LaunchEnableForConcurrentThreadsAt_SERVER_Framework());
    std::cout << "done Registers - DEFINE." << std::endl;

    std::cout << "started Registers - SUBSTANTIATE." << std::endl;
    stat_CLASS_get_ptr_LaunchEnableForConcurrentThreadsAt_SERVER_Framework()->boot2_REG_SUBSTANTIATE_LaunchEnableForConcurrentThreadsAt_SERVER_Framework(stat_CLASS_get_ptr_LaunchEnableForConcurrentThreadsAt_SERVER_Framework());
    std::cout << "done Registers - SUBSTANTIATE." << std::endl;

    std::cout << "started Registers - INITIALISE." << std::endl;
    stat_CLASS_get_ptr_LaunchEnableForConcurrentThreadsAt_SERVER_Framework()->boot3_REG_INITIALISE_LaunchEnableForConcurrentThreadsAt_SERVER_Framework(stat_CLASS_get_ptr_LaunchEnableForConcurrentThreadsAt_SERVER_Framework());
    std::cout << "done Registers - INITIALISE." << std::endl;

    std::cout << "started Program - INSTANTIATE." << std::endl;
    stat_CLASS_get_ptr_LaunchEnableForConcurrentThreadsAt_SERVER_Framework()->boot4_PGM_INSTANTIATE_LaunchEnableForConcurrentThreadsAt_SERVER_Framework(stat_CLASS_get_ptr_LaunchEnableForConcurrentThreadsAt_SERVER_Framework());
    std::cout << "done Program - INSTANTIATE." << std::endl;

    std::cout << "" << std::endl;
    std::cout << "        ,     \\      /      ," << std::endl;
    std::cout << "       / \\    )\\ __ /(     / \\ " << std::endl;
    std::cout << "      /   \\   (_\\  /_)    /   \\ " << std::endl;
    std::cout << "____ / ____\\__ \\@  @/ ___/_____\\_____" << std::endl;
    std::cout << "|              |\\../|               |" << std::endl;
    std::cout << "|               \\VV/                |" << std::endl;
    std::cout << "|        MIT Launch Que .dll        |" << std::endl;
    std::cout << "|___________________________________|" << std::endl;
    std::cout << "|    / \\ /        \\\\        \\ /\\    |" << std::endl;
    std::cout << "|  /    V          ))        V   \\  |" << std::endl;
    std::cout << "|/                //               \\| " << std::endl;
    std::cout << "`                 V                 '" << std::endl;
    std::cout << "" << std::endl;
    return (void*)stat_CLASS_get_ptr_LaunchEnableForConcurrentThreadsAt_SERVER_Framework();
}
void OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtSERVER::CLIBLaunchEnableForConcurrentThreadsAtSERVER::app_FUNCT_request_Wait_launch(void* obj, unsigned char* bytes)
{
    OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtSERVER::LaunchEnableForConcurrentThreadsAt_SERVER_Global::stat_CONVERT_Obj_To_ClassOf(obj)->dyn_CLASS_get_ptr_LaunchConcurrency()->app_thread_Start(OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtSERVER::LaunchEnableForConcurrentThreadsAt_SERVER_Global::stat_CONVERT_Obj_To_ClassOf(obj), OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtSERVER::LaunchEnableForConcurrentThreadsAt_SERVER_Global::stat_CONVERT_ByteArray_To_uint8_t(bytes));
}
void OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtSERVER::CLIBLaunchEnableForConcurrentThreadsAtSERVER::app_FUNCT_terminate_Progaram()
{
    delete _ptr_Framework_LaunchEnableForConcurrentThreadsAt_SERVER;
}
void OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtSERVER::CLIBLaunchEnableForConcurrentThreadsAtSERVER::app_FUNCT_thread_End(void* obj, unsigned char* bytes)
{
    OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtSERVER::LaunchEnableForConcurrentThreadsAt_SERVER_Global::stat_CONVERT_Obj_To_ClassOf(obj)->dyn_CLASS_get_ptr_LaunchConcurrency()->app_thread_End(OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtSERVER::LaunchEnableForConcurrentThreadsAt_SERVER_Global::stat_CONVERT_Obj_To_ClassOf(obj), (uint8_t)*bytes);
}
unsigned char* OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtSERVER::CLIBLaunchEnableForConcurrentThreadsAtSERVER::app_FUNCT_get_coreId_To_launch(void* obj)
{
    return OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtSERVER::LaunchEnableForConcurrentThreadsAt_SERVER_Global::stat_CONVERT_uint8_t_To_ByteArray(OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtSERVER::LaunchEnableForConcurrentThreadsAt_SERVER_Global::stat_CONVERT_Obj_To_ClassOf(obj)->dyn_CLASS_get_ptr_LaunchConcurrency()->dyn_CLASS_get_ptr_LaunchConcurrency_Control()->dyn_REG_get_Item_On_list_for_Que_Of_CoreTolaunch(0));
}
bool OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtSERVER::CLIBLaunchEnableForConcurrentThreadsAtSERVER::app_FUNCT_get_Flag_Active(void* obj)
{
    return OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtSERVER::LaunchEnableForConcurrentThreadsAt_SERVER_Global::stat_CONVERT_Obj_To_ClassOf(obj)->dyn_CLASS_get_ptr_LaunchConcurrency()->dyn_CLASS_get_ptr_Global()->dyn_REG_get_ptr_flag_thread_2STATE_ACTIVE();
}
bool OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtSERVER::CLIBLaunchEnableForConcurrentThreadsAtSERVER::app_FUNCT_get_Flag_ConcurrentCoreState(void* obj, unsigned char* bytes)
{
    return OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtSERVER::LaunchEnableForConcurrentThreadsAt_SERVER_Global::stat_CONVERT_Obj_To_ClassOf(obj)->dyn_CLASS_get_ptr_LaunchConcurrency()->dyn_CLASS_get_ptr_LaunchConcurrency_Control()->dyn_REG_get_Item_On_list_Of_STATE_For_ConcurrentCore(OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtSERVER::LaunchEnableForConcurrentThreadsAt_SERVER_Global::stat_CONVERT_ByteArray_To_uint8_t(bytes));
}
bool OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtSERVER::CLIBLaunchEnableForConcurrentThreadsAtSERVER::app_FUNCT_get_Flag_Idle(void* obj)
{
    return OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtSERVER::LaunchEnableForConcurrentThreadsAt_SERVER_Global::stat_CONVERT_Obj_To_ClassOf(obj)->dyn_CLASS_get_ptr_LaunchConcurrency()->dyn_CLASS_get_ptr_Global()->dyn_REG_get_ptr_flag_thread_2STATE_IDLE();
}
bool OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtSERVER::CLIBLaunchEnableForConcurrentThreadsAtSERVER::app_FUNCT_get_State_launchBit(void* obj)
{
    return OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtSERVER::LaunchEnableForConcurrentThreadsAt_SERVER_Global::stat_CONVERT_Obj_To_ClassOf(obj)->dyn_CLASS_get_ptr_LaunchConcurrency()->dyn_CLASS_get_ptr_LaunchConcurrency_Control()->dyn_REG_get_Item_On_list_Of_STATE_For_ConcurrentCore(OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtSERVER::LaunchEnableForConcurrentThreadsAt_SERVER_Global::stat_CONVERT_Obj_To_ClassOf(obj)->dyn_CLASS_get_ptr_LaunchConcurrency()->dyn_CLASS_get_ptr_LaunchConcurrency_Control()->dyn_REG_get_Item_On_list_for_Que_Of_CoreTolaunch(0));
}
void OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtSERVER::CLIBLaunchEnableForConcurrentThreadsAtSERVER::app_FUNCT_set_Flag_ConcurrentCoreState(void* obj, unsigned char* bytes, bool newValue)
{
    OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtSERVER::LaunchEnableForConcurrentThreadsAt_SERVER_Global::stat_CONVERT_Obj_To_ClassOf(obj)->dyn_CLASS_get_ptr_LaunchConcurrency()->dyn_CLASS_get_ptr_LaunchConcurrency_Control()->set_Item_On_list_Of_STATE_For_ConcurrentCore(OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtSERVER::LaunchEnableForConcurrentThreadsAt_SERVER_Global::stat_CONVERT_Obj_To_ClassOf(obj)->dyn_CLASS_get_ptr_LaunchConcurrency()->dyn_CLASS_get_ptr_Global()->stat_CONVERT_ByteArray_To_uint8_t(bytes), newValue);
}
void OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtSERVER::CLIBLaunchEnableForConcurrentThreadsAtSERVER::stat_boot1_CLASS_DEFINE_LaunchEnableForConcurrentThreadsAt_SERVER_Framework()
{
    _ptr_Framework_LaunchEnableForConcurrentThreadsAt_SERVER = NULL;
}
void OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtSERVER::CLIBLaunchEnableForConcurrentThreadsAtSERVER::stat_boot3_CLASS_INITIALISE_LaunchEnableForConcurrentThreadsAt_SERVER_Framework()
{
    _ptr_Framework_LaunchEnableForConcurrentThreadsAt_SERVER = new OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtSERVER::LaunchEnableForConcurrentThreadsAt_SERVER_Framework();
    while (stat_CLASS_get_ptr_LaunchEnableForConcurrentThreadsAt_SERVER_Framework() == NULL) {}
}
OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtSERVER::LaunchEnableForConcurrentThreadsAt_SERVER_Framework* OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtSERVER::CLIBLaunchEnableForConcurrentThreadsAtSERVER::stat_CLASS_get_ptr_LaunchEnableForConcurrentThreadsAt_SERVER_Framework()
{
    return _ptr_Framework_LaunchEnableForConcurrentThreadsAt_SERVER;
}
````

### LIB_WriteEnableForThreadsAt_CLIENTINPUTACTION.dll.
#### Header.
````
#ifdef LIBWRITEENABLEFORTHREADSATCLIENTINPUTACTION_EXPORTS
#define LIBWRITEENABLEFORTHREADSATCLIENTINPUTACTION_API __declspec(dllexport)
#else
#define LIBWRITEENABLEFORTHREADSATCLIENTINPUTACTION_API __declspec(dllimport)
#endif
extern "C"
{
	namespace OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION
	{
		class LIBWRITEENABLEFORTHREADSATCLIENTINPUTACTION_API CLIBWriteEnableForThreadsAtCLIENTINPUTACTION
		{
		public:
			static void* app_FUNCT_generate_Program();
			static void app_FUNCT_terminate_Program();
			static void app_FUNCT_write_End(void*, unsigned char* bytes);
			static void app_FUNCT_write_Start(void*, unsigned char* bytes);
		private:
			static void stat_boot1_CLASS_DEFINE_Framework();
			static void stat_boot3_CLASS_INITIALISE_Framework();
			static class WriteEnableForThreadsAt_CLIENTINPUTACTION_Framework* stat_CLASS_get_ptr_Framework();
		};
	}
}
````
#### Source.
````
#include "pch.h"
#include "framework.h"
#include "LIB_WriteEnableForThreadsAt_CLIENTINPUTACTION.h"
class OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::WriteEnableForThreadsAt_CLIENTINPUTACTION_Framework* _ptr_Framework_WriteEnableForThreadsAt_CLIENTINPUTACTION;
void* OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::CLIBWriteEnableForThreadsAtCLIENTINPUTACTION::app_FUNCT_generate_Program()
{
	std::cout << "started Classes - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE." << std::endl;
	stat_boot1_CLASS_DEFINE_Framework();
	stat_boot3_CLASS_INITIALISE_Framework();
	std::cout << "done Classes - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE." << std::endl;

	std::cout << "started Registers - DEFINE" << std::endl;
	stat_CLASS_get_ptr_Framework()->boot1_REG_DEFINE_WriteEnableForThreadsAt_CLIENTINPUTACTION_Framework(stat_CLASS_get_ptr_Framework());
	std::cout << "done Registers - DEFINE." << std::endl;

	std::cout << "started Registers - SUBSTANTIATE." << std::endl;
	stat_CLASS_get_ptr_Framework()->boot2_REG_SUBSTANTIATE_WriteEnableForThreadsAt_CLIENTINPUTACTION_Framework(stat_CLASS_get_ptr_Framework());
	std::cout << "done Registers - SUBSTANTIATE." << std::endl;

	std::cout << "started Registers - INITIALISE." << std::endl;
	stat_CLASS_get_ptr_Framework()->boot3_REG_INITIALISE_WriteEnableForThreadsAt_CLIENTINPUTACTION_Framework(stat_CLASS_get_ptr_Framework());
	std::cout << "done Registers - INITIALISE." << std::endl;

	std::cout << "started Program - INSTANTIATE." << std::endl;
	stat_CLASS_get_ptr_Framework()->boot4_PGM_INSTANTIATE_WriteEnableForThreadsAt_CLIENTINPUTACTION_Framework(stat_CLASS_get_ptr_Framework());
	std::cout << "done Program - INSTANTIATE." << std::endl;
	
	std::cout << "" << std::endl;
	std::cout << "        ,     \\      /      ," << std::endl;
	std::cout << "        ,     \\      /      ," << std::endl;
	std::cout << "       / \\    )\\ __ /(     / \\ " << std::endl;
	std::cout << "      /   \\   (_\\  /_)    /   \\ " << std::endl;
	std::cout << "____ / ____\\__ \\@  @/ ___/_____\\_____" << std::endl;
	std::cout << "|              |\\../|               |" << std::endl;
	std::cout << "|               \\VV/                |" << std::endl;
	std::cout << "|        MIT Write Que .dll         |" << std::endl;
	std::cout << "|___________________________________|" << std::endl;
	std::cout << "|    / \\ /        \\\\        \\ /\\    |" << std::endl;
	std::cout << "|  /    V          ))        V   \\  |" << std::endl;
	std::cout << "|/                //               \\| " << std::endl;
	std::cout << "`                 V                 '" << std::endl;
	std::cout << "" << std::endl;
	return (void*)stat_CLASS_get_ptr_Framework();
}
void OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::CLIBWriteEnableForThreadsAtCLIENTINPUTACTION::app_FUNCT_terminate_Program()
{
	delete _ptr_Framework_WriteEnableForThreadsAt_CLIENTINPUTACTION;
	while (stat_CLASS_get_ptr_Framework() != NULL) {}
}
void OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::CLIBWriteEnableForThreadsAtCLIENTINPUTACTION::app_FUNCT_write_End(void* obj, unsigned char* bytes)
{
	OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::WriteEnableForThreadsAt_CLIENTINPUTACTION_Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_WriteEnable()->dyn_app_FUNCT_write_End(OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::WriteEnableForThreadsAt_CLIENTINPUTACTION_Global::stat_CONVERT_ObjPtr_to_Class(obj), OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::WriteEnableForThreadsAt_CLIENTINPUTACTION_Global::stat_CONVERT_ByteArray_to_uint8_t(bytes));
}
void OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::CLIBWriteEnableForThreadsAtCLIENTINPUTACTION::app_FUNCT_write_Start(void* obj, unsigned char* bytes)
{
	OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::WriteEnableForThreadsAt_CLIENTINPUTACTION_Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_WriteEnable()->dyn_app_FUNCT_write_Start(OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::WriteEnableForThreadsAt_CLIENTINPUTACTION_Global::stat_CONVERT_ObjPtr_to_Class(obj), OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::WriteEnableForThreadsAt_CLIENTINPUTACTION_Global::stat_CONVERT_ByteArray_to_uint8_t(bytes));
}
void OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::CLIBWriteEnableForThreadsAtCLIENTINPUTACTION::stat_boot1_CLASS_DEFINE_Framework()
{
	_ptr_Framework_WriteEnableForThreadsAt_CLIENTINPUTACTION = NULL;
}
void OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::CLIBWriteEnableForThreadsAtCLIENTINPUTACTION::stat_boot3_CLASS_INITIALISE_Framework()
{
	_ptr_Framework_WriteEnableForThreadsAt_CLIENTINPUTACTION = new class OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::WriteEnableForThreadsAt_CLIENTINPUTACTION_Framework();
	while (stat_CLASS_get_ptr_Framework() == NULL) {}
}
OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::WriteEnableForThreadsAt_CLIENTINPUTACTION_Framework* OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::CLIBWriteEnableForThreadsAtCLIENTINPUTACTION::stat_CLASS_get_ptr_Framework()
{
	return _ptr_Framework_WriteEnableForThreadsAt_CLIENTINPUTACTION;
}
````

### LIB_WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE.dll.
#### Header.
````
#ifdef LIBWRITEENABLEFORTHREADSATCLIENTOUTPUTRECIEVE_EXPORTS
#define LIBWRITEENABLEFORTHREADSATCLIENTOUTPUTRECIEVE_API __declspec(dllexport)
#else
#define LIBWRITEENABLEFORTHREADSATCLIENTOUTPUTRECIEVE_API __declspec(dllimport)
#endif
extern "C"
{
	namespace OpenAvrilCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE
	{
		class LIBWRITEENABLEFORTHREADSATCLIENTOUTPUTRECIEVE_API CLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE
		{
		public:
			static void* app_FUNCT_generate_Program();
			static void app_FUNCT_terminate_Program();
			static void app_FUNCT_write_End(void*, unsigned char* bytes);
			static void app_FUNCT_write_Start(void*, unsigned char* bytes);
		private:
			static void stat_boot1_CLASS_DEFINE_Framework();
			static void stat_boot3_CLASS_INITIALISE_Framework();
			static class WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE_Framework* stat_CLASS_get_ptr_Framework();
		};
	}
}
````
#### Source.
````
#include "pch.h"
#include "framework.h"
#include "LIB_WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE.h"
class OpenAvrilCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE_Framework* _ptr_Framework_WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE;
void* OpenAvrilCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::CLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::app_FUNCT_generate_Program()
{
	std::cout << "started Classes - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE." << std::endl;
	stat_boot1_CLASS_DEFINE_Framework();
	stat_boot3_CLASS_INITIALISE_Framework();
	std::cout << "done Classes - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE." << std::endl;

	std::cout << "started Registers - DEFINE" << std::endl;
	stat_CLASS_get_ptr_Framework()->boot1_REG_DEFINE_WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE_Framework(stat_CLASS_get_ptr_Framework());
	std::cout << "done Registers - DEFINE." << std::endl;

	std::cout << "started Registers - SUBSTANTIATE." << std::endl;
	stat_CLASS_get_ptr_Framework()->boot2_REG_SUBSTANTIATE_WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE_Framework(stat_CLASS_get_ptr_Framework());
	std::cout << "done Registers - SUBSTANTIATE." << std::endl;

	std::cout << "started Registers - INITIALISE." << std::endl;
	stat_CLASS_get_ptr_Framework()->boot3_REG_INITIALISE_WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE_Framework(stat_CLASS_get_ptr_Framework());
	std::cout << "done Registers - INITIALISE." << std::endl;

	std::cout << "started Program - INSTANTIATE." << std::endl;
	stat_CLASS_get_ptr_Framework()->boot4_PGM_INSTANTIATE_WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE_Framework(stat_CLASS_get_ptr_Framework());
	std::cout << "done Program - INSTANTIATE." << std::endl;
	
	std::cout << "" << std::endl;
	std::cout << "        ,     \\      /      ," << std::endl;
	std::cout << "        ,     \\      /      ," << std::endl;
	std::cout << "       / \\    )\\ __ /(     / \\ " << std::endl;
	std::cout << "      /   \\   (_\\  /_)    /   \\ " << std::endl;
	std::cout << "____ / ____\\__ \\@  @/ ___/_____\\_____" << std::endl;
	std::cout << "|              |\\../|               |" << std::endl;
	std::cout << "|               \\VV/                |" << std::endl;
	std::cout << "|        MIT Write Que .dll         |" << std::endl;
	std::cout << "|___________________________________|" << std::endl;
	std::cout << "|    / \\ /        \\\\        \\ /\\    |" << std::endl;
	std::cout << "|  /    V          ))        V   \\  |" << std::endl;
	std::cout << "|/                //               \\| " << std::endl;
	std::cout << "`                 V                 '" << std::endl;
	std::cout << "" << std::endl;
	return (void*)stat_CLASS_get_ptr_Framework();
}
void OpenAvrilCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::CLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::app_FUNCT_terminate_Program()
{
	delete _ptr_Framework_WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE;
	while (stat_CLASS_get_ptr_Framework() != NULL) {}
}
void OpenAvrilCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::CLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::app_FUNCT_write_End(void* obj, unsigned char* bytes)
{
	OpenAvrilCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE_Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_WriteEnable()->dyn_app_FUNCT_write_End(OpenAvrilCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE_Global::stat_CONVERT_ObjPtr_to_Class(obj), OpenAvrilCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE_Global::stat_CONVERT_ByteArray_to_uint8_t(bytes));
}
void OpenAvrilCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::CLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::app_FUNCT_write_Start(void* obj, unsigned char* bytes)
{
	OpenAvrilCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE_Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_WriteEnable()->dyn_app_FUNCT_write_Start(OpenAvrilCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE_Global::stat_CONVERT_ObjPtr_to_Class(obj), OpenAvrilCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE_Global::stat_CONVERT_ByteArray_to_uint8_t(bytes));
}
void OpenAvrilCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::CLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::stat_boot1_CLASS_DEFINE_Framework()
{
	_ptr_Framework_WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE = NULL;
}
void OpenAvrilCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::CLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::stat_boot3_CLASS_INITIALISE_Framework()
{
	_ptr_Framework_WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE = new class OpenAvrilCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE_Framework();
	while (stat_CLASS_get_ptr_Framework() == NULL) {}
}
OpenAvrilCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE_Framework* OpenAvrilCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::CLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::stat_CLASS_get_ptr_Framework()
{
	return _ptr_Framework_WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE;
}
````

### LIB_WriteEnableForThreadsAt_SERVERINPUTACTION.dll.
#### Header.
````
#ifdef LIBWRITEENABLEFORTHREADSATSERVERINPUTACTION_EXPORTS
#define LIBWRITEENABLEFORTHREADSATSERVERINPUTACTION_API __declspec(dllexport)
#else
#define LIBWRITEENABLEFORTHREADSATSERVERINPUTACTION_API __declspec(dllimport)
#endif
extern "C"
{
	namespace OpenAvrilCLIBWriteEnableForThreadsAtSERVERINPUTACTION
	{
		class LIBWRITEENABLEFORTHREADSATSERVERINPUTACTION_API CLIBWriteEnableForThreadsAtSERVERINPUTACTION
		{
		public:
			static void* app_FUNCT_generate_Program();
			static void app_FUNCT_terminate_Program();
			static void app_FUNCT_write_End(void*, unsigned char* bytes);
			static void app_FUNCT_write_Start(void*, unsigned char* bytes);
		private:
			static void stat_boot1_CLASS_DEFINE_Framework();
			static void stat_boot3_CLASS_INITIALISE_Framework();
			static class WriteEnableForThreadsAt_SERVERINPUTACTION_Framework* stat_CLASS_get_ptr_Framework();
		};
	}
}
````
#### Source.
````
#include "pch.h"
#include "framework.h"
#include "LIB_WriteEnableForThreadsAt_SERVERINPUTACTION.h"
class OpenAvrilCLIBWriteEnableForThreadsAtSERVERINPUTACTION::WriteEnableForThreadsAt_SERVERINPUTACTION_Framework* _ptr_Framework_WriteEnableForThreadsAt_SERVERINPUTACTION;
void* OpenAvrilCLIBWriteEnableForThreadsAtSERVERINPUTACTION::CLIBWriteEnableForThreadsAtSERVERINPUTACTION::app_FUNCT_generate_Program()
{
	std::cout << "started Classes - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE." << std::endl;
	stat_boot1_CLASS_DEFINE_Framework();
	stat_boot3_CLASS_INITIALISE_Framework();
	std::cout << "done Classes - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE." << std::endl;

	std::cout << "started Registers - DEFINE" << std::endl;
	stat_CLASS_get_ptr_Framework()->boot1_REG_DEFINE_WriteEnableForThreadsAt_SERVERINPUTACTION_Framework(stat_CLASS_get_ptr_Framework());
	std::cout << "done Registers - DEFINE." << std::endl;

	std::cout << "started Registers - SUBSTANTIATE." << std::endl;
	stat_CLASS_get_ptr_Framework()->boot2_REG_SUBSTANTIATE_WriteEnableForThreadsAt_SERVERINPUTACTION_Framework(stat_CLASS_get_ptr_Framework());
	std::cout << "done Registers - SUBSTANTIATE." << std::endl;

	std::cout << "started Registers - INITIALISE." << std::endl;
	stat_CLASS_get_ptr_Framework()->boot3_REG_INITIALISE_WriteEnableForThreadsAt_SERVERINPUTACTION_Framework(stat_CLASS_get_ptr_Framework());
	std::cout << "done Registers - INITIALISE." << std::endl;

	std::cout << "started Program - INSTANTIATE." << std::endl;
	stat_CLASS_get_ptr_Framework()->boot4_PGM_INSTANTIATE_WriteEnableForThreadsAt_SERVERINPUTACTION_Framework(stat_CLASS_get_ptr_Framework());
	std::cout << "done Program - INSTANTIATE." << std::endl;
	
	std::cout << "" << std::endl;
	std::cout << "        ,     \\      /      ," << std::endl;
	std::cout << "        ,     \\      /      ," << std::endl;
	std::cout << "       / \\    )\\ __ /(     / \\ " << std::endl;
	std::cout << "      /   \\   (_\\  /_)    /   \\ " << std::endl;
	std::cout << "____ / ____\\__ \\@  @/ ___/_____\\_____" << std::endl;
	std::cout << "|              |\\../|               |" << std::endl;
	std::cout << "|               \\VV/                |" << std::endl;
	std::cout << "|        MIT Write Que .dll         |" << std::endl;
	std::cout << "|___________________________________|" << std::endl;
	std::cout << "|    / \\ /        \\\\        \\ /\\    |" << std::endl;
	std::cout << "|  /    V          ))        V   \\  |" << std::endl;
	std::cout << "|/                //               \\| " << std::endl;
	std::cout << "`                 V                 '" << std::endl;
	std::cout << "" << std::endl;
	return (void*)stat_CLASS_get_ptr_Framework();
}
void OpenAvrilCLIBWriteEnableForThreadsAtSERVERINPUTACTION::CLIBWriteEnableForThreadsAtSERVERINPUTACTION::app_FUNCT_terminate_Program()
{
	delete _ptr_Framework_WriteEnableForThreadsAt_SERVERINPUTACTION;
	while (stat_CLASS_get_ptr_Framework() != NULL) {}
}
void OpenAvrilCLIBWriteEnableForThreadsAtSERVERINPUTACTION::CLIBWriteEnableForThreadsAtSERVERINPUTACTION::app_FUNCT_write_End(void* obj, unsigned char* bytes)
{
	OpenAvrilCLIBWriteEnableForThreadsAtSERVERINPUTACTION::WriteEnableForThreadsAt_SERVERINPUTACTION_Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_WriteEnable()->dyn_app_FUNCT_write_End(OpenAvrilCLIBWriteEnableForThreadsAtSERVERINPUTACTION::WriteEnableForThreadsAt_SERVERINPUTACTION_Global::stat_CONVERT_ObjPtr_to_Class(obj), OpenAvrilCLIBWriteEnableForThreadsAtSERVERINPUTACTION::WriteEnableForThreadsAt_SERVERINPUTACTION_Global::stat_CONVERT_ByteArray_to_uint8_t(bytes));
}
void OpenAvrilCLIBWriteEnableForThreadsAtSERVERINPUTACTION::CLIBWriteEnableForThreadsAtSERVERINPUTACTION::app_FUNCT_write_Start(void* obj, unsigned char* bytes)
{
	OpenAvrilCLIBWriteEnableForThreadsAtSERVERINPUTACTION::WriteEnableForThreadsAt_SERVERINPUTACTION_Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_WriteEnable()->dyn_app_FUNCT_write_Start(OpenAvrilCLIBWriteEnableForThreadsAtSERVERINPUTACTION::WriteEnableForThreadsAt_SERVERINPUTACTION_Global::stat_CONVERT_ObjPtr_to_Class(obj), OpenAvrilCLIBWriteEnableForThreadsAtSERVERINPUTACTION::WriteEnableForThreadsAt_SERVERINPUTACTION_Global::stat_CONVERT_ByteArray_to_uint8_t(bytes));
}
void OpenAvrilCLIBWriteEnableForThreadsAtSERVERINPUTACTION::CLIBWriteEnableForThreadsAtSERVERINPUTACTION::stat_boot1_CLASS_DEFINE_Framework()
{
	_ptr_Framework_WriteEnableForThreadsAt_SERVERINPUTACTION = NULL;
}
void OpenAvrilCLIBWriteEnableForThreadsAtSERVERINPUTACTION::CLIBWriteEnableForThreadsAtSERVERINPUTACTION::stat_boot3_CLASS_INITIALISE_Framework()
{
	_ptr_Framework_WriteEnableForThreadsAt_SERVERINPUTACTION = new class OpenAvrilCLIBWriteEnableForThreadsAtSERVERINPUTACTION::WriteEnableForThreadsAt_SERVERINPUTACTION_Framework();
	while (stat_CLASS_get_ptr_Framework() == NULL) {}
}
OpenAvrilCLIBWriteEnableForThreadsAtSERVERINPUTACTION::WriteEnableForThreadsAt_SERVERINPUTACTION_Framework* OpenAvrilCLIBWriteEnableForThreadsAtSERVERINPUTACTION::CLIBWriteEnableForThreadsAtSERVERINPUTACTION::stat_CLASS_get_ptr_Framework()
{
	return _ptr_Framework_WriteEnableForThreadsAt_SERVERINPUTACTION;
}
````

### LIB_LaunchEnableForConcurrentThreadsAt_SERVER.dll.
#### Header.
````
#ifdef LIBWRITEENABLEFORTHREADSATSERVEROUTPUTRECIEVE_EXPORTS
#define LIBWRITEENABLEFORTHREADSATSERVEROUTPUTRECIEVE_API __declspec(dllexport)
#else
#define LIBWRITEENABLEFORTHREADSATSERVEROUTPUTRECIEVE_API __declspec(dllimport)
#endif
extern "C"
{
	namespace OpenAvrilCLIBWriteEnableForThreadsAtSERVEROUTPUTRECIEVE
	{
		class LIBWRITEENABLEFORTHREADSATSERVEROUTPUTRECIEVE_API CLIBWriteEnableForThreadsAtSERVEROUTPUTRECIEVE
		{
		public:
			static void* app_FUNCT_generate_Program();
			static void app_FUNCT_terminate_Program();
			static void app_FUNCT_write_End(void*, unsigned char* bytes);
			static void app_FUNCT_write_Start(void*, unsigned char* bytes);
		private:
			static void stat_boot1_CLASS_DEFINE_Framework();
			static void stat_boot3_CLASS_INITIALISE_Framework();
			static class WriteEnableForThreadsAt_SERVEROUTPUTRECIEVE_Framework* stat_CLASS_get_ptr_Framework();
		};
	}
}
````
#### Source.
````
#include "pch.h"
#include "framework.h"
#include "LIB_WriteEnableForThreadsAt_SERVEROUTPUTRECIEVE.h"
class OpenAvrilCLIBWriteEnableForThreadsAtSERVEROUTPUTRECIEVE::WriteEnableForThreadsAt_SERVEROUTPUTRECIEVE_Framework* _ptr_Framework_WriteEnableForThreadsAt_SERVEROUTPUTRECIEVE;
void* OpenAvrilCLIBWriteEnableForThreadsAtSERVEROUTPUTRECIEVE::CLIBWriteEnableForThreadsAtSERVEROUTPUTRECIEVE::app_FUNCT_generate_Program()
{
	std::cout << "started Classes - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE." << std::endl;
	stat_boot1_CLASS_DEFINE_Framework();
	stat_boot3_CLASS_INITIALISE_Framework();
	std::cout << "done Classes - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE." << std::endl;

	std::cout << "started Registers - DEFINE" << std::endl;
	stat_CLASS_get_ptr_Framework()->boot1_REG_DEFINE_WriteEnableForThreadsAt_SERVEROUTPUTRECIEVE_Framework(stat_CLASS_get_ptr_Framework());
	std::cout << "done Registers - DEFINE." << std::endl;

	std::cout << "started Registers - SUBSTANTIATE." << std::endl;
	stat_CLASS_get_ptr_Framework()->boot2_REG_SUBSTANTIATE_WriteEnableForThreadsAt_SERVEROUTPUTRECIEVE_Framework(stat_CLASS_get_ptr_Framework());
	std::cout << "done Registers - SUBSTANTIATE." << std::endl;

	std::cout << "started Registers - INITIALISE." << std::endl;
	stat_CLASS_get_ptr_Framework()->boot3_REG_INITIALISE_WriteEnableForThreadsAt_SERVEROUTPUTRECIEVE_Framework(stat_CLASS_get_ptr_Framework());
	std::cout << "done Registers - INITIALISE." << std::endl;

	std::cout << "started Program - INSTANTIATE." << std::endl;
	stat_CLASS_get_ptr_Framework()->boot4_PGM_INSTANTIATE_WriteEnableForThreadsAt_SERVEROUTPUTRECIEVE_Framework(stat_CLASS_get_ptr_Framework());
	std::cout << "done Program - INSTANTIATE." << std::endl;
	
	std::cout << "" << std::endl;
	std::cout << "        ,     \\      /      ," << std::endl;
	std::cout << "        ,     \\      /      ," << std::endl;
	std::cout << "       / \\    )\\ __ /(     / \\ " << std::endl;
	std::cout << "      /   \\   (_\\  /_)    /   \\ " << std::endl;
	std::cout << "____ / ____\\__ \\@  @/ ___/_____\\_____" << std::endl;
	std::cout << "|              |\\../|               |" << std::endl;
	std::cout << "|               \\VV/                |" << std::endl;
	std::cout << "|        MIT Write Que .dll         |" << std::endl;
	std::cout << "|___________________________________|" << std::endl;
	std::cout << "|    / \\ /        \\\\        \\ /\\    |" << std::endl;
	std::cout << "|  /    V          ))        V   \\  |" << std::endl;
	std::cout << "|/                //               \\| " << std::endl;
	std::cout << "`                 V                 '" << std::endl;
	std::cout << "" << std::endl;
	return (void*)stat_CLASS_get_ptr_Framework();
}
void OpenAvrilCLIBWriteEnableForThreadsAtSERVEROUTPUTRECIEVE::CLIBWriteEnableForThreadsAtSERVEROUTPUTRECIEVE::app_FUNCT_terminate_Program()
{
	delete _ptr_Framework_WriteEnableForThreadsAt_SERVEROUTPUTRECIEVE;
	while (stat_CLASS_get_ptr_Framework() != NULL) {}
}
void OpenAvrilCLIBWriteEnableForThreadsAtSERVEROUTPUTRECIEVE::CLIBWriteEnableForThreadsAtSERVEROUTPUTRECIEVE::app_FUNCT_write_End(void* obj, unsigned char* bytes)
{
	OpenAvrilCLIBWriteEnableForThreadsAtSERVEROUTPUTRECIEVE::WriteEnableForThreadsAt_SERVEROUTPUTRECIEVE_Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_WriteEnable()->dyn_app_FUNCT_write_End(OpenAvrilCLIBWriteEnableForThreadsAtSERVEROUTPUTRECIEVE::WriteEnableForThreadsAt_SERVEROUTPUTRECIEVE_Global::stat_CONVERT_ObjPtr_to_Class(obj), OpenAvrilCLIBWriteEnableForThreadsAtSERVEROUTPUTRECIEVE::WriteEnableForThreadsAt_SERVEROUTPUTRECIEVE_Global::stat_CONVERT_ByteArray_to_uint8_t(bytes));
}
void OpenAvrilCLIBWriteEnableForThreadsAtSERVEROUTPUTRECIEVE::CLIBWriteEnableForThreadsAtSERVEROUTPUTRECIEVE::app_FUNCT_write_Start(void* obj, unsigned char* bytes)
{
	OpenAvrilCLIBWriteEnableForThreadsAtSERVEROUTPUTRECIEVE::WriteEnableForThreadsAt_SERVEROUTPUTRECIEVE_Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_WriteEnable()->dyn_app_FUNCT_write_Start(OpenAvrilCLIBWriteEnableForThreadsAtSERVEROUTPUTRECIEVE::WriteEnableForThreadsAt_SERVEROUTPUTRECIEVE_Global::stat_CONVERT_ObjPtr_to_Class(obj), OpenAvrilCLIBWriteEnableForThreadsAtSERVEROUTPUTRECIEVE::WriteEnableForThreadsAt_SERVEROUTPUTRECIEVE_Global::stat_CONVERT_ByteArray_to_uint8_t(bytes));
}
void OpenAvrilCLIBWriteEnableForThreadsAtSERVEROUTPUTRECIEVE::CLIBWriteEnableForThreadsAtSERVEROUTPUTRECIEVE::stat_boot1_CLASS_DEFINE_Framework()
{
	_ptr_Framework_WriteEnableForThreadsAt_SERVEROUTPUTRECIEVE = NULL;
}
void OpenAvrilCLIBWriteEnableForThreadsAtSERVEROUTPUTRECIEVE::CLIBWriteEnableForThreadsAtSERVEROUTPUTRECIEVE::stat_boot3_CLASS_INITIALISE_Framework()
{
	_ptr_Framework_WriteEnableForThreadsAt_SERVEROUTPUTRECIEVE = new class OpenAvrilCLIBWriteEnableForThreadsAtSERVEROUTPUTRECIEVE::WriteEnableForThreadsAt_SERVEROUTPUTRECIEVE_Framework();
	while (stat_CLASS_get_ptr_Framework() == NULL) {}
}
OpenAvrilCLIBWriteEnableForThreadsAtSERVEROUTPUTRECIEVE::WriteEnableForThreadsAt_SERVEROUTPUTRECIEVE_Framework* OpenAvrilCLIBWriteEnableForThreadsAtSERVEROUTPUTRECIEVE::CLIBWriteEnableForThreadsAtSERVEROUTPUTRECIEVE::stat_CLASS_get_ptr_Framework()
{
	return _ptr_Framework_WriteEnableForThreadsAt_SERVEROUTPUTRECIEVE;
}
````

### LIB_OpenAvrilConcurrent_IO_Server.dll.
#### Header.
````
#ifdef LIBSERVERIOCONCURRNECY_EXPORTS
#define LIBSERVERIOCONCURRNECY_API __declspec(dllexport)
#else
#define LIBSERVERIOCONCURRNECY_API __declspec(dllimport)
#endif
extern "C"
{
	namespace OpenAvrilConcurrency
	{
		class LIBSERVERIOCONCURRNECY_API CLIBConcurrentServerIO
		{
		public:
			static void app_FUNCT_flip_Input_DoubleBuffer(void* obj);
			static void* app_FUNCT_generate_Program();
			static void app_FUNCT_select_set_Intput_Subset(void* obj, unsigned char* bytes);
			static void app_FUNCT_terminate_Program(void* obj);
			static void app_FUNCT_pop_From_Stack_Of_Output(void* obj);
			static void app_FUNCT_push_To_STACK_Of_Input(void* obj);
			static bool dyn_REG_get_flag_isStackLoaded_Server_InputAction(void* obj);
			static bool dyn_REG_get_flag_isLoaded_Stack_OutputSend(void* obj);
			static bool dyn_REG_get_flag_IsInitialised_OpenAvrilConcurrency(void* obj);
			static unsigned char* dyn_REG_get_ptr_PraiseEventId(void* obj);
			static unsigned char* dyn_REG_get_ptr_output_Value(void* obj);
			static void dyn_REG_set_Item_input_Value_A(void* obj, unsigned char* bytes);
			static void dyn_REG_set_Item_input_Value_B(void* obj, unsigned char* bytes);
			static void dyn_REG_set_PraiseEventId(void* obj, unsigned char* bytes);
			static void* dyn_PGM_get_program_WriteEnableStack_ServerInputAction(void* obj);
			static void* dyn_PGM_get_program_WriteEnableStack_ServerOutputRecieve(void* obj);
		private:
			static void stat_CLASS_boot1_DEFINE_Framework();
			static void stat_CLASS_boot3_INITIALISE_Framework();
			static void* stat_CLASS_get_ptr_Framework_Server();
		};
	}
}
````
#### Source.
````
#include "pch.h"
#include "framework.h"
#include "LIB_Concurrent_IO_Server.h"
	static void* _CLASS_ptr_Framework_Server;
// public.
	void OpenAvrilConcurrency::CLIBConcurrentServerIO::app_FUNCT_flip_Input_DoubleBuffer(void* obj)
	{
		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_Server()->dyn_CLASS_get_ptr_Data()->dyn_CLASS_get_ptr_Data_Control()->app_FUNCT_flip_Input_DoubleBuffer();
	}
	void* OpenAvrilConcurrency::CLIBConcurrentServerIO::app_FUNCT_generate_Program()
	{
		std::cout << "entered app_FUNCT_generate_Program()." << std::endl;

		std::cout << "started Classe(s) - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE." << std::endl;
		stat_CLASS_boot1_DEFINE_Framework();
		stat_CLASS_boot3_INITIALISE_Framework();
		std::cout << "done Classe(s) - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE." << std::endl;

		std::cout << "started Structure(s) - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE." << std::endl;
		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->stat_STRUCT_boot0_DECLAIRE();
		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->stat_STRUCT_boot1_DEFINE();
		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->stat_STRUCT_boot3_INITIALISE(OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server()), OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->dyn_STRUCT_get_Concurrent(), OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->dyn_STRUCT_get_Input(), OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->dyn_STRUCT_get_Output());
		std::cout << "done Structure(s) - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE." << std::endl;

		std::cout << "started Registers - DEFINE" << std::endl;
		
		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->dyn_REG_boot1_DEFINE_Framework_Server(OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server()));
		std::cout << "done Registers - DEFINE." << std::endl;

		std::cout << "started Registers - SUBSTANTIATE." << std::endl;
		
		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->dyn_REG_boot2_SUBSTANTIATE_Framework_Server(OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server()));
		std::cout << "done Registers - SUBSTANTIATE." << std::endl;

		std::cout << "started Registers - INITIALISE." << std::endl;
		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->dyn_REG_boot3_INITIALISE_Framework_Server(OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server()));
		std::cout << "done Registers - INITIALISE." << std::endl;

		std::cout << "started Program - INSTANTIATE." << std::endl;
		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->dyn_PGM_boot4_INSTANTIATE_Framework_Server(OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server()));
		std::cout << "done Program - INSTANTIATE." << std::endl;

		std::cout << " " << std::endl;
		std::cout << "        ,     \\      /      ," << std::endl;
		std::cout << "       / \\    )\\ __ /(     / \\ " << std::endl;
		std::cout << "      /   \\   (_\\  /_)    /   \\ " << std::endl;
		std::cout << "____ / ____\\__ \\@  @/ ___/_____\\_____" << std::endl;
		std::cout << "|              |\\../|               |" << std::endl;
		std::cout << "|               \\VV/                |" << std::endl;
		std::cout << "|      MIT OpenAvrilConcurrency     |" << std::endl;
		std::cout << "|___________________________________|" << std::endl;
		std::cout << "|    / \\ /        \\\\        \\ /\\    |" << std::endl;
		std::cout << "|  /    V          ))        V   \\  |" << std::endl;
		std::cout << "|/                //               \\| " << std::endl;
		std::cout << "`                 V                 '" << std::endl;
		std::cout << " " << std::endl;
		return (void*)stat_CLASS_get_ptr_Framework_Server();
	}
	void OpenAvrilConcurrency::CLIBConcurrentServerIO::app_FUNCT_select_set_Intput_Subset(void* obj, unsigned char* bytes)
	{
		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_Server()->dyn_CLASS_get_ptr_Data()->dyn_REG_get_ptr_Item_array_Of_doubleBuffer_Input_WRITE(OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj))->dyn_CLASS_get_ptr_Input_Control()->app_select_And_Set_Input_Subset(OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj), OpenAvrilConcurrency::Global::stat_CONVERT_ByteArray_to_uint8_t(bytes));
	}
	void OpenAvrilConcurrency::CLIBConcurrentServerIO::app_FUNCT_terminate_Program(void* obj)
	{
		delete _CLASS_ptr_Framework_Server;
	}
	void OpenAvrilConcurrency::CLIBConcurrentServerIO::app_FUNCT_pop_From_Stack_Of_Output(void* obj)
	{
		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_Server()->dyn_CLASS_get_ptr_Data()->dyn_CLASS_get_ptr_Data_Control()->app_FUNCT_pop_From_Stack_Of_Output(OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj));
	}
	void OpenAvrilConcurrency::CLIBConcurrentServerIO::app_FUNCT_push_To_STACK_Of_Input(void* obj)
	{
		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_Server()->dyn_CLASS_get_ptr_Data()->dyn_CLASS_get_ptr_Data_Control()->app_FUNCT_push_To_STACK_Of_Input(OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj));
	}
	bool OpenAvrilConcurrency::CLIBConcurrentServerIO::dyn_REG_get_flag_isStackLoaded_Server_InputAction(void* obj)
	{
		return OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_Server()->dyn_CLASS_get_ptr_Data()->dyn_CLASS_get_ptr_Data_Control()->dyn_REG_get_Item_flag_isLoaded_Stack_InputAction();
	}
	bool OpenAvrilConcurrency::CLIBConcurrentServerIO::dyn_REG_get_flag_isLoaded_Stack_OutputSend(void* obj)
	{
		return OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_Server()->dyn_CLASS_get_ptr_Data()->dyn_CLASS_get_ptr_Data_Control()->dyn_REG_get_Item_flag_isLoaded_Stack_OutputSend();
	}
	bool OpenAvrilConcurrency::CLIBConcurrentServerIO::dyn_REG_get_flag_IsInitialised_OpenAvrilConcurrency(void* obj)
	{
		return OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_Server()->dyn_CLASS_get_ptr_Execute()->dyn_CLASS_get_ptr_Execute_Control()->dyn_REG_get_Flag_is_SystemInitialised();
	}
	unsigned char* OpenAvrilConcurrency::CLIBConcurrentServerIO::dyn_REG_get_ptr_PraiseEventId(void* obj)
	{
		return OpenAvrilConcurrency::Global::stat_CONVERT_uint8_t_to_ByteArray(OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_Server()->dyn_CLASS_get_ptr_Data()->dyn_REG_get_ptr_Item_array_Of_doubleBuffer_Output_WRITE(OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj))->dyn_REG_get_ptr_Output_praiseEventId());
	}
	unsigned char* OpenAvrilConcurrency::CLIBConcurrentServerIO::dyn_REG_get_ptr_output_Value(void* obj)
	{
		return nullptr;
	}
	void OpenAvrilConcurrency::CLIBConcurrentServerIO::dyn_REG_set_Item_input_Value_A(void* obj, unsigned char* bytes)
	{
		OpenAvrilConcurrency::Praise0_Input* objPraise0_input = (OpenAvrilConcurrency::Praise0_Input*)OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_Server()->dyn_CLASS_get_ptr_Data()->dyn_REG_get_ptr_Item_array_Of_doubleBuffer_Input_WRITE(OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj));
		objPraise0_input->dyn_REG_set_Item_input_Value_A(OpenAvrilConcurrency::Global::stat_CONVERT_ByteArray_to_Float(bytes));
		delete objPraise0_input;
	}
	void OpenAvrilConcurrency::CLIBConcurrentServerIO::dyn_REG_set_Item_input_Value_B(void* obj, unsigned char* bytes)
	{
		OpenAvrilConcurrency::Praise0_Input* objPraise0_input = (OpenAvrilConcurrency::Praise0_Input*)OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_Server()->dyn_CLASS_get_ptr_Data()->dyn_REG_get_ptr_Item_array_Of_doubleBuffer_Input_WRITE(OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj))->dyn_REG_get_ptr_Input_praiseEventId();
		objPraise0_input->dyn_REG_set_Item_input_Value_B(OpenAvrilConcurrency::Global::stat_CONVERT_ByteArray_to_Float(bytes));
		delete objPraise0_input;
	}
	void OpenAvrilConcurrency::CLIBConcurrentServerIO::dyn_REG_set_PraiseEventId(void* obj, unsigned char* bytes)
	{
		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_Server()->dyn_CLASS_get_ptr_Data()->dyn_REG_get_ptr_Item_array_Of_doubleBuffer_Input_WRITE(OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj))->dyn_REG_set_ptr_Input_praiseEventId(OpenAvrilConcurrency::Global::stat_CONVERT_ByteArray_to_uint8_t(bytes));
	}
	void* OpenAvrilConcurrency::CLIBConcurrentServerIO::dyn_PGM_get_program_WriteEnableStack_ServerInputAction(void* obj)
	{
		return OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_Server()->dyn_CLASS_get_ptr_Execute()->dyn_PGM_get_WriteEnable_ServerInputAction();
	}
	void* OpenAvrilConcurrency::CLIBConcurrentServerIO::dyn_PGM_get_program_WriteEnableStack_ServerOutputRecieve(void* obj)
	{
		return OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_Server()->dyn_CLASS_get_ptr_Execute()->dyn_PGM_get_WriteEnable_ServerOutputRecieve();
	}
// private.
	void OpenAvrilConcurrency::CLIBConcurrentServerIO::stat_CLASS_boot1_DEFINE_Framework()
	{
		_CLASS_ptr_Framework_Server = NULL;
	}
	void OpenAvrilConcurrency::CLIBConcurrentServerIO::stat_CLASS_boot3_INITIALISE_Framework()
	{
		_CLASS_ptr_Framework_Server = new class OpenAvrilConcurrency::Framework_Server();
		while (stat_CLASS_get_ptr_Framework_Server() == NULL) {}
	}
	void* OpenAvrilConcurrency::CLIBConcurrentServerIO::stat_CLASS_get_ptr_Framework_Server()
	{
		return _CLASS_ptr_Framework_Server;
	}
````

## C# Imports.
### ImportCLIBLaunchEnableForConcurrentThreadsAtCLIENT.dll.
````
using System;
using System.Runtime.InteropServices;
using System.Security;

namespace OpenAvrilCFSD
{
    [SuppressUnmanagedCodeSecurity]
    public static class ImportCLIBLaunchEnableForConcurrentThreadsAtCLIENT
    {
        [DllImport("LIBLaunchEnableForConcurrentThreadsAtCLIENT.dll", EntryPoint = "?app_FUNCT_generate_Program@CLIBLaunchEnableForConcurrentThreadsAtCLIENT@OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT@@SAPAXXZ")]
        public static extern IntPtr app_FUNCT_generate_Program();

		[DllImport("LIBLaunchEnableForConcurrentThreadsAtCLIENT.dll", EntryPoint = "?app_FUNCT_request_Wait_launch@CLIBLaunchEnableForConcurrentThreadsAtCLIENT@OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT@@SAXPAXPAE@Z")]
		public static extern void app_FUNCT_request_Wait_launch(IntPtr obj, byte concurrent_CoreId);

		[DllImport("LIBLaunchEnableForConcurrentThreadsAtCLIENT.dll", EntryPoint = "?app_FUNCT_terminate_Progaram@CLIBLaunchEnableForConcurrentThreadsAtCLIENT@OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT@@SAXXZ")]
		public static extern void app_FUNCT_terminate_Progaram();

		[DllImport("LIBLaunchEnableForConcurrentThreadsAtCLIENT.dll", EntryPoint = "?app_FUNCT_thread_End@CLIBLaunchEnableForConcurrentThreadsAtCLIENT@OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT@@SAXPAXPAE@Z")]
		public static extern byte app_FUNCT_thread_End(IntPtr obj, byte concurrent_CoreId);

		[DllImport("LIBLaunchEnableForConcurrentThreadsAtCLIENT.dll", EntryPoint = "?app_FUNCT_get_coreId_To_launch@CLIBLaunchEnableForConcurrentThreadsAtCLIENT@OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT@@SAPAEPAX@Z")]
		public static extern bool app_FUNCT_get_coreId_To_launch(IntPtr obj);

		[DllImport("LIBLaunchEnableForConcurrentThreadsAtCLIENT.dll", EntryPoint = "?app_FUNCT_get_Flag_Active@CLIBLaunchEnableForConcurrentThreadsAtCLIENT@OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT@@SA_NPAX@Z")]
		public static extern bool app_FUNCT_get_Flag_Active(IntPtr obj);

		[DllImport("LIBLaunchEnableForConcurrentThreadsAtCLIENT.dll", EntryPoint = "?app_FUNCT_get_Flag_ConcurrentCoreState@CLIBLaunchEnableForConcurrentThreadsAtCLIENT@OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT@@SA_NPAXPAE@Z")]
		public static extern bool app_FUNCT_get_Flag_ConcurrentCoreState(IntPtr obj, byte concurrent_CoreId);

		[DllImport("LIBLaunchEnableForConcurrentThreadsAtCLIENT.dll", EntryPoint = "?app_FUNCT_get_Flag_Idle@CLIBLaunchEnableForConcurrentThreadsAtCLIENT@OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT@@SA_NPAX@Z")]
		public static extern bool app_FUNCT_get_Flag_Idle(IntPtr obj);

		[DllImport("LIBLaunchEnableForConcurrentThreadsAtCLIENT.dll", EntryPoint = "?app_FUNCT_set_Flag_ConcurrentCoreState@CLIBLaunchEnableForConcurrentThreadsAtCLIENT@OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT@@SAXPAXPAE_N@Z")]
		public static extern void app_FUNCT_set_Flag_ConcurrentCoreState(IntPtr obj, byte concurrent_CoreId, bool value);
    }
}
````

### ImportCLIBWriteEnableForThreadsAtCLIENTINPUTACTION.dll.
````
using System;
using System.Runtime.InteropServices;
using System.Security;
namespace OpenAvrilCFSD
{
    [SuppressUnmanagedCodeSecurity]
    public static class ImportCLIBWriteEnableForThreadsAtCLIENTINPUTACTION
    {
        [DllImport("LIBWriteEnableForThreadsAtCLIENTINPUTACTION.dll", EntryPoint = "?app_FUNCT_generate_Program@CLIBWriteEnableForThreadsAtCLIENTINPUTACTION@OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION@@SAPAXXZ")]
        public static extern IntPtr app_FUNCT_generate_Program();

        [DllImport("LIBWriteEnableForThreadsAtCLIENTINPUTACTION.dll", EntryPoint = "?app_FUNCT_terminate_Program@CLIBWriteEnableForThreadsAtCLIENTINPUTACTION@OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION@@SAXXZ")]
        public static extern void app_FUNCT_terminate_Program();

        [DllImport("LIBWriteEnableForThreadsAtCLIENTINPUTACTION.dll", EntryPoint = "?app_FUNCT_write_End@CLIBWriteEnableForThreadsAtCLIENTINPUTACTION@OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION@@SAXPAXPAE@Z")]
        public static extern void app_FUNCT_write_End(IntPtr obj, byte coreId);

        [DllImport("LIBWriteEnableForThreadsAtCLIENTINPUTACTION.dll", EntryPoint = "?app_FUNCT_write_Start@CLIBWriteEnableForThreadsAtCLIENTINPUTACTION@OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION@@SAXPAXPAE@Z")]
        public static extern void app_FUNCT_write_Start(IntPtr obj, byte coreId);
    }
}
````

### ImportCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE.dll.
````
using System;
using System.Runtime.InteropServices;
using System.Security;
namespace OpenAvrilCFSD
{
    [SuppressUnmanagedCodeSecurity]
    public static class ImportCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE
    {
        [DllImport("LIB_WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE.dll", EntryPoint = "?app_FUNCT_generate_Program@CLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE@OpenAvrilCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE@@SAPAXXZ")]
        public static extern IntPtr app_FUNCT_generate_Program();

        [DllImport("LIB_WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE.dll", EntryPoint = "?app_FUNCT_terminate_Program@CLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE@OpenAvrilCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE@@SAXXZ")]
        public static extern void app_FUNCT_terminate_Program();

        [DllImport("LIB_WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE.dll", EntryPoint = "?app_FUNCT_write_End@CLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE@OpenAvrilCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE@@SAXPAXPAE@Z")]
        public static extern void app_FUNCT_write_End(IntPtr obj, byte coreId);

        [DllImport("LIB_WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE.dll", EntryPoint = "?app_FUNCT_write_Start@CLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE@OpenAvrilCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE@@SAXPAXPAE@Z")]
        public static extern void app_FUNCT_write_Start(IntPtr obj, byte coreId);
    }
}
````

### ImportCLIBConcurrentServerIO.dll.
````
using OpenTK.Graphics.OpenGL;
using System;
using System.Runtime.InteropServices;
using System.Security;

namespace OpenAvrilCFSD
{
    [SuppressUnmanagedCodeSecurity]
    public static class ImportCLIBConcurrentServerIO
    {
        [DllImport("LIBConcurrentIOServer.dll", EntryPoint = "?app_FUNCT_flip_Input_DoubleBuffer@CLIBConcurrentServerIO@OpenAvrilConcurrency@@SAXPAX@Z")]
        public static extern void app_FUNCT_flip_Input_DoubleBuffer(IntPtr obj);

        [DllImport("LIBConcurrentIOServer.dll", EntryPoint = "?app_FUNCT_generate_Program@CLIBConcurrentServerIO@OpenAvrilConcurrency@@SAPAXXZ")]
        public static extern IntPtr app_FUNCT_generate_Program();

        [DllImport("LIBConcurrentIOServer.dll", EntryPoint = "?app_FUNCT_select_set_Intput_Subset@CLIBConcurrentServerIO@OpenAvrilConcurrency@@SAXPAXPAE@Z")]
        public static extern void app_FUNCT_select_set_Intput_Subset(IntPtr obj, byte bytes);

        [DllImport("LIBConcurrentIOServer.dll", EntryPoint = "?app_FUNCT_terminate_Program@CLIBConcurrentServerIO@OpenAvrilConcurrency@@SAXPAX@Z")]
        public static extern void app_FUNCT_terminate_Program();

        [DllImport("LIBConcurrentIOServer.dll", EntryPoint = "?app_FUNCT_pop_From_Stack_Of_Output@CLIBConcurrentServerIO@OpenAvrilConcurrency@@SAXPAX@Z")]
        public static extern void app_FUNCT_pop_From_Stack_Of_Output(IntPtr obj);

        [DllImport("LIBConcurrentIOServer.dll", EntryPoint = "?app_FUNCT_push_To_STACK_Of_Input@CLIBConcurrentServerIO@OpenAvrilConcurrency@@SAXPAX@Z")]
        public static extern void app_FUNCT_push_To_STACK_Of_Input(IntPtr obj);

        [DllImport("LIBConcurrentIOServer.dll", EntryPoint = "?dyn_REG_get_flag_isStackLoaded_Server_InputAction@CLIBConcurrentServerIO@OpenAvrilConcurrency@@SA_NPAX@Z")]
        public static extern bool dyn_REG_get_flag_isStackLoaded_Server_InputAction(IntPtr obj);

        [DllImport("LIBConcurrentIOServer.dll", EntryPoint = "?dyn_REG_get_flag_isStackLoaded_Server_OutputSend@CLIBConcurrentServerIO@OpenAvrilConcurrency@@SA_NPAX@Z")]
        public static extern bool dyn_REG_get_flag_isStackLoaded_Server_OutputSend(IntPtr obj);

        [DllImport("LIBConcurrentIOServer.dll", EntryPoint = "?dyn_REG_get_flag_IsInitialised_OpenAvrilConcurrency@CLIBConcurrentServerIO@OpenAvrilConcurrency@@SA_NPAX@Z")]
        public static extern bool dyn_REG_get_flag_IsInitialised_OpenAvrilConcurrency(IntPtr obj);

        [DllImport("LIBConcurrentIOServer.dll", EntryPoint = "?dyn_REG_get_ptr_PraiseEventId@CLIBConcurrentServerIO@OpenAvrilConcurrency@@SAPAEPAX@Z")]
        public static extern byte dyn_REG_get_ptr_PraiseEventId(IntPtr obj);

        [DllImport("LIBConcurrentIOServer.dll", EntryPoint = "?dyn_REG_get_ptr_output_Value@CLIBConcurrentServerIO@OpenAvrilConcurrency@@SAPAEPAX@Z")]
        public static extern byte dyn_REG_get_ptr_output_Value(IntPtr obj);

        [DllImport("LIBConcurrentIOServer.dll", EntryPoint = "?dyn_REG_set_Item_input_Value_A@CLIBConcurrentServerIO@OpenAvrilConcurrency@@SAXPAXPAE@Z")]
        public static extern void dyn_REG_set_Item_input_Value_A(IntPtr obj);

        [DllImport("LIBConcurrentIOServer.dll", EntryPoint = "?dyn_REG_set_Item_input_Value_B@CLIBConcurrentServerIO@OpenAvrilConcurrency@@SAXPAXPAE@Z")]
        public static extern void dyn_REG_set_Item_input_Value_B(IntPtr obj);

        [DllImport("LIBConcurrentIOServer.dll", EntryPoint = "?dyn_REG_set_PraiseEventId@CLIBConcurrentServerIO@OpenAvrilConcurrency@@SAXPAXPAE@Z")]
        public static extern void dyn_REG_set_PraiseEventId(IntPtr obj, byte praiseEventId);

        [DllImport("LIBConcurrentIOServer.dll", EntryPoint = "?dyn_PGM_get_program_WriteEnableStack_ServerInputAction@CLIBConcurrentServerIO@OpenAvrilConcurrency@@SAPAXPAX@Z")]
        public static extern IntPtr dyn_PGM_get_program_WriteEnableStack_ServerInputAction(IntPtr obj);

        [DllImport("LIBConcurrentIOServer.dll", EntryPoint = "?dyn_PGM_get_program_WriteEnableStack_ServerOutputRecieve@CLIBConcurrentServerIO@OpenAvrilConcurrency@@SAPAXPAX@Z")]
        public static extern IntPtr dyn_PGM_get_program_WriteEnableStack_ServerOutputRecieve(IntPtr obj);
    }
}
````

## Java Imports.
### JavaLIBConcurrentIOServer.java.
````
package lib;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public interface JavaLIBConcurrentIOServer  extends Library
{
    JavaLIBConcurrentIOServer INSTANCE = (JavaLIBConcurrentIOServer) Native.load("LIBConcurrentIOServer", JavaLIBConcurrentIOServer.class);
    void app_FUNCT_flip_Input_DoubleBuffer(Pointer obj);
    Pointer app_FUNCT_generate_Program();
    void app_FUNCT_select_set_Intput_Subset(Pointer obj, byte[] bytes);
    void app_FUNCT_terminate_Program();
    void app_FUNCT_pop_From_Stack_Of_Output(Pointer obj);
    void app_FUNCT_push_To_STACK_Of_Input(Pointer obj);
    byte[] dyn_REG_get_flag_isStackLoaded_Server_InputAction(Pointer obj);
    byte[] dyn_REG_get_flag_isStackLoaded_Server_OutputSend(Pointer obj);
    byte[] dyn_REG_get_flag_IsInitialised_OpenAvrilConcurrency(Pointer obj);
    byte[] dyn_REG_get_ptr_PraiseEventId(Pointer obj);
    byte[] dyn_REG_get_ptr_output_Value(Pointer obj);
    void dyn_REG_set_Item_input_Value_A(Pointer obj, byte[] bytes);
    void dyn_REG_set_Item_input_Value_B(Pointer obj, byte[] bytes);
    void dyn_REG_set_PraiseEventId(Pointer obj, byte[] bytes);
    Pointer dyn_PGM_get_program_WriteEnableStack_ServerInputAction(Pointer obj);
    Pointer dyn_PGM_get_program_WriteEnableStack_ServerOutputRecieve(Pointer obj);
}
````

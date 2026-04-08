# .

## Client.
### Native C++ Libraries.
#### LIB_LaunchEnableForConcurrentThreadsAt_CLIENT.dll.
##### Header.
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
			static bool app_FUNCT_get_flag_isPGM_INSTNATIATED();
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
			static bool* _stat_REG_flag_isMemberFunctionINSTANTIATIOND;
			static void stat_app_FUNCT_Calc_IsAllINSTANTIATED();
			static void stat_boot1_CLASS_DEFINE_LaunchEnableForConcurrentThreadsAt_CLIENT_Framework();
			static void stat_boot3_CLASS_INITIALISE_LaunchEnableForConcurrentThreadsAt_CLIENT_Framework();
			static class LaunchEnableForConcurrentThreadsAt_CLIENT_Framework* stat_CLASS_get_ptr_LaunchEnableForConcurrentThreadsAt_CLIENT_Framework();
			static void stat_REG_boot1_DEFINE_flag_isMemberFunctionINSTANTIATED();
			static void stat_REG_boot2_SUBSTANTIATE_flag_isMemberFunctionINSTANTIATED();
			static void stat_REG_boot3_INITIALISE_flag_isMemberFunctionINSTANTIATED();
			static bool* stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED();
		};
	}
}
````
##### Source.
````
#include "pch.h"
#include "framework.h"
#include "LIB_LaunchEnableForConcurrentThreadsAt_CLIENT.h"
class OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT::LaunchEnableForConcurrentThreadsAt_CLIENT_Framework* _ptr_Framework_LaunchEnableForConcurrentThreadsAt_CLIENT;
bool* _stat_REG_flag_isMemberFunctionINSTANTIATED;
void* OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT::CLIBLaunchEnableForConcurrentThreadsAtCLIENT::app_FUNCT_generate_Program()
{
    std::cout << "started Classes - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE." << std::endl;
    stat_boot1_CLASS_DEFINE_LaunchEnableForConcurrentThreadsAt_CLIENT_Framework();
    stat_boot3_CLASS_INITIALISE_LaunchEnableForConcurrentThreadsAt_CLIENT_Framework();
    std::cout << "done Classes - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE." << std::endl;

    std::cout << "started Registers - DEFINE" << std::endl;
    stat_CLASS_get_ptr_LaunchEnableForConcurrentThreadsAt_CLIENT_Framework()->boot1_REG_DEFINE_LaunchEnableForConcurrentThreadsAt_CLIENT_Framework(stat_CLASS_get_ptr_LaunchEnableForConcurrentThreadsAt_CLIENT_Framework());
    std::cout << "done Registers - DEFINE." << std::endl;

    std::cout << "started Registers - SUBSTANTIATE." << std::endl;
    stat_CLASS_get_ptr_LaunchEnableForConcurrentThreadsAt_CLIENT_Framework()->boot2_REG_SUBSTANTIATE_LaunchEnableForConcurrentThreadsAt_CLIENT_Framework(stat_CLASS_get_ptr_LaunchEnableForConcurrentThreadsAt_CLIENT_Framework());
    std::cout << "done Registers - SUBSTANTIATE." << std::endl;

    std::cout << "started Registers - INITIALISE." << std::endl;
    stat_CLASS_get_ptr_LaunchEnableForConcurrentThreadsAt_CLIENT_Framework()->boot3_REG_INITIALISE_LaunchEnableForConcurrentThreadsAt_CLIENT_Framework(stat_CLASS_get_ptr_LaunchEnableForConcurrentThreadsAt_CLIENT_Framework());
    std::cout << "done Registers - INITIALISE." << std::endl;

    std::cout << "started Program - INSTANTIATION." << std::endl;
    stat_REG_boot1_DEFINE_flag_isMemberFunctionINSTANTIATED();
    stat_REG_boot2_SUBSTANTIATE_flag_isMemberFunctionINSTANTIATED();
    stat_REG_boot3_INITIALISE_flag_isMemberFunctionINSTANTIATED();
    stat_CLASS_get_ptr_LaunchEnableForConcurrentThreadsAt_CLIENT_Framework()->boot4_PGM_INSTANTIATION_LaunchEnableForConcurrentThreadsAt_CLIENT_Framework(stat_CLASS_get_ptr_LaunchEnableForConcurrentThreadsAt_CLIENT_Framework());
    std::cout << "done Program - INSTANTIATION." << std::endl;

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
    return (void*)stat_CLASS_get_ptr_LaunchEnableForConcurrentThreadsAt_CLIENT_Framework();
}
bool OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT::CLIBLaunchEnableForConcurrentThreadsAtCLIENT::app_FUNCT_get_flag_isPGM_INSTNATIATED()
{
    if (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[1] == false) {
        return stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[0];
    }
    else {
        stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[1] = false;
    }
}
void OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT::CLIBLaunchEnableForConcurrentThreadsAtCLIENT::app_FUNCT_request_Wait_launch(void* obj, unsigned char* bytes)
{
    if (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[2] == false) {
        OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT::LaunchEnableForConcurrentThreadsAt_CLIENT_Global::stat_CONVERT_Obj_To_ClassOf(obj)->dyn_CLASS_get_ptr_LaunchConcurrency()->app_thread_Start(OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT::LaunchEnableForConcurrentThreadsAt_CLIENT_Global::stat_CONVERT_Obj_To_ClassOf(obj), OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT::LaunchEnableForConcurrentThreadsAt_CLIENT_Global::stat_CONVERT_ByteArray_To_uint8_t(bytes));
    }
    else {
        stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[2] = false;
    }
    
}
void OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT::CLIBLaunchEnableForConcurrentThreadsAtCLIENT::app_FUNCT_terminate_Progaram()
{
    if (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[3] == false) {
        delete _ptr_Framework_LaunchEnableForConcurrentThreadsAt_CLIENT;
    }
    else {
        stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[3] = false;
    }
}
void OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT::CLIBLaunchEnableForConcurrentThreadsAtCLIENT::app_FUNCT_thread_End(void* obj, unsigned char* bytes)
{
    if (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[4] == false) {
        OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT::LaunchEnableForConcurrentThreadsAt_CLIENT_Global::stat_CONVERT_Obj_To_ClassOf(obj)->dyn_CLASS_get_ptr_LaunchConcurrency()->app_thread_End(OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT::LaunchEnableForConcurrentThreadsAt_CLIENT_Global::stat_CONVERT_Obj_To_ClassOf(obj), (uint8_t)*bytes);
    }
    else {
        stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[4] = false;
    }
}
unsigned char* OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT::CLIBLaunchEnableForConcurrentThreadsAtCLIENT::app_FUNCT_get_coreId_To_launch(void* obj)
{
    if (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[5] == false) {
        return OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT::LaunchEnableForConcurrentThreadsAt_CLIENT_Global::stat_CONVERT_uint8_t_To_ByteArray(OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT::LaunchEnableForConcurrentThreadsAt_CLIENT_Global::stat_CONVERT_Obj_To_ClassOf(obj)->dyn_CLASS_get_ptr_LaunchConcurrency()->dyn_CLASS_get_ptr_LaunchConcurrency_Control()->dyn_REG_get_Item_On_list_for_Que_Of_CoreTolaunch(0));
    }
    else {
        stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[5] = false;
        return OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT::LaunchEnableForConcurrentThreadsAt_CLIENT_Global::stat_CONVERT_uint8_t_To_ByteArray(UINT8_MAX);
    }
}
bool OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT::CLIBLaunchEnableForConcurrentThreadsAtCLIENT::app_FUNCT_get_Flag_Active(void* obj)
{
    if (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[6] == false) {
        return OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT::LaunchEnableForConcurrentThreadsAt_CLIENT_Global::stat_CONVERT_Obj_To_ClassOf(obj)->dyn_CLASS_get_ptr_LaunchConcurrency()->dyn_CLASS_get_ptr_Global()->dyn_REG_get_ptr_flag_thread_2STATE_ACTIVE();
    }
    else {
        stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[6] = false;
        return true;
    }
}
bool OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT::CLIBLaunchEnableForConcurrentThreadsAtCLIENT::app_FUNCT_get_Flag_ConcurrentCoreState(void* obj, unsigned char* bytes)
{
    if (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[7] == false) {
        return OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT::LaunchEnableForConcurrentThreadsAt_CLIENT_Global::stat_CONVERT_Obj_To_ClassOf(obj)->dyn_CLASS_get_ptr_LaunchConcurrency()->dyn_CLASS_get_ptr_LaunchConcurrency_Control()->dyn_REG_get_Item_On_list_Of_STATE_For_ConcurrentCore(OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT::LaunchEnableForConcurrentThreadsAt_CLIENT_Global::stat_CONVERT_ByteArray_To_uint8_t(bytes));
    }
    else {
        stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[7] = false;
        return true;
    }
}
bool OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT::CLIBLaunchEnableForConcurrentThreadsAtCLIENT::app_FUNCT_get_Flag_Idle(void* obj)
{
    if (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[8] == false) {
        return OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT::LaunchEnableForConcurrentThreadsAt_CLIENT_Global::stat_CONVERT_Obj_To_ClassOf(obj)->dyn_CLASS_get_ptr_LaunchConcurrency()->dyn_CLASS_get_ptr_Global()->dyn_REG_get_ptr_flag_thread_2STATE_IDLE();
    }
    else {
        stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[8] = false;
        return true;
    }
}
bool OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT::CLIBLaunchEnableForConcurrentThreadsAtCLIENT::app_FUNCT_get_State_launchBit(void* obj)
{
    if (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[9] == false) {
        return OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT::LaunchEnableForConcurrentThreadsAt_CLIENT_Global::stat_CONVERT_Obj_To_ClassOf(obj)->dyn_CLASS_get_ptr_LaunchConcurrency()->dyn_CLASS_get_ptr_LaunchConcurrency_Control()->dyn_REG_get_Item_On_list_Of_STATE_For_ConcurrentCore(OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT::LaunchEnableForConcurrentThreadsAt_CLIENT_Global::stat_CONVERT_Obj_To_ClassOf(obj)->dyn_CLASS_get_ptr_LaunchConcurrency()->dyn_CLASS_get_ptr_LaunchConcurrency_Control()->dyn_REG_get_Item_On_list_for_Que_Of_CoreTolaunch(0));
    }
    else {
        stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[9] = false;
        return true;
    }
}
void OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT::CLIBLaunchEnableForConcurrentThreadsAtCLIENT::app_FUNCT_set_Flag_ConcurrentCoreState(void* obj, unsigned char* bytes, bool newValue)
{
    if (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[10] == false) {
        OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT::LaunchEnableForConcurrentThreadsAt_CLIENT_Global::stat_CONVERT_Obj_To_ClassOf(obj)->dyn_CLASS_get_ptr_LaunchConcurrency()->dyn_CLASS_get_ptr_LaunchConcurrency_Control()->set_Item_On_list_Of_STATE_For_ConcurrentCore(OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT::LaunchEnableForConcurrentThreadsAt_CLIENT_Global::stat_CONVERT_Obj_To_ClassOf(obj)->dyn_CLASS_get_ptr_LaunchConcurrency()->dyn_CLASS_get_ptr_Global()->stat_CONVERT_ByteArray_To_uint8_t(bytes), newValue);
    }
    else {
        stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[10] = false;
        stat_app_FUNCT_Calc_IsAllINSTANTIATED();//INSTANTIATE this member function last.
    }
}
void OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT::CLIBLaunchEnableForConcurrentThreadsAtCLIENT::stat_app_FUNCT_Calc_IsAllINSTANTIATED()
{
    stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[0] = false;
    for (uint8_t memberFunctionId = 1; memberFunctionId < sizeof(*stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()); memberFunctionId++)
    {
        if (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[memberFunctionId] == true)
        {
            stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[0] = true;
        }
    }
}
void OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT::CLIBLaunchEnableForConcurrentThreadsAtCLIENT::stat_boot1_CLASS_DEFINE_LaunchEnableForConcurrentThreadsAt_CLIENT_Framework()
{
    _ptr_Framework_LaunchEnableForConcurrentThreadsAt_CLIENT = NULL;
}
void OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT::CLIBLaunchEnableForConcurrentThreadsAtCLIENT::stat_boot3_CLASS_INITIALISE_LaunchEnableForConcurrentThreadsAt_CLIENT_Framework()
{
    _ptr_Framework_LaunchEnableForConcurrentThreadsAt_CLIENT = new OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT::LaunchEnableForConcurrentThreadsAt_CLIENT_Framework();
    while (stat_CLASS_get_ptr_LaunchEnableForConcurrentThreadsAt_CLIENT_Framework() == NULL) {}
}
OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT::LaunchEnableForConcurrentThreadsAt_CLIENT_Framework* OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT::CLIBLaunchEnableForConcurrentThreadsAtCLIENT::stat_CLASS_get_ptr_LaunchEnableForConcurrentThreadsAt_CLIENT_Framework()
{
    return _ptr_Framework_LaunchEnableForConcurrentThreadsAt_CLIENT;
}
void OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT::CLIBLaunchEnableForConcurrentThreadsAtCLIENT::stat_REG_boot1_DEFINE_flag_isMemberFunctionINSTANTIATED()
{
    _stat_REG_flag_isMemberFunctionINSTANTIATED = NULL;
}
void OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT::CLIBLaunchEnableForConcurrentThreadsAtCLIENT::stat_REG_boot2_SUBSTANTIATE_flag_isMemberFunctionINSTANTIATED()
{
    _stat_REG_flag_isMemberFunctionINSTANTIATED = new bool[11]();
    while (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED() == NULL) { }
    for (uint8_t index = 0; index < sizeof(*stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()); index++)
    {
        _stat_REG_flag_isMemberFunctionINSTANTIATED[index] = true;
    }
}
void OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT::CLIBLaunchEnableForConcurrentThreadsAtCLIENT::stat_REG_boot3_INITIALISE_flag_isMemberFunctionINSTANTIATED()
{
    for (uint8_t index = 0; index < sizeof(*stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()); index++)
    {
        _stat_REG_flag_isMemberFunctionINSTANTIATED[index] = true;
    }
}
bool* OpenAvrilCLIBLaunchEnableForConcurrentThreadsAtCLIENT::CLIBLaunchEnableForConcurrentThreadsAtCLIENT::stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()
{
    return _stat_REG_flag_isMemberFunctionINSTANTIATED;
}
````
#### LIB_WriteEnableForThreadsAt_CLIENTINPUTACTION.dll.
##### Header.
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
			static bool app_FUNCT_get_flag_isPGM_INSTNATIATED();
			static void app_FUNCT_terminate_Program();
			static void app_FUNCT_write_End(void*, unsigned char* bytes);
			static void app_FUNCT_write_Start(void*, unsigned char* bytes);
		private:
			static bool* _stat_REG_flag_isMemberFunctionINSTANTIATIOND;
			static void stat_app_FUNCT_Calc_IsAllINSTANTIATED();
			static void stat_boot1_CLASS_DEFINE_Framework();
			static void stat_boot3_CLASS_INITIALISE_Framework();
			static class WriteEnableForThreadsAt_CLIENTINPUTACTION_Framework* stat_CLASS_get_ptr_Framework();
			static void stat_REG_boot1_DEFINE_flag_isMemberFunctionINSTANTIATED();
			static void stat_REG_boot2_SUBSTANTIATE_flag_isMemberFunctionINSTANTIATED();
			static void stat_REG_boot3_INITIALISE_flag_isMemberFunctionINSTANTIATED();
			static bool* stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED();
		};
	}
}
````
##### Source.
````
#include "pch.h"
#include "framework.h"
#include "LIB_WriteEnableForThreadsAt_CLIENTINPUTACTION.h"
class OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::WriteEnableForThreadsAt_CLIENTINPUTACTION_Framework* _ptr_Framework_WriteEnableForThreadsAt_CLIENTINPUTACTION;
bool* _stat_REG_flag_isMemberFunctionINSTANTIATED;
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

	std::cout << "started Program - INSTANTIATION." << std::endl;
	stat_REG_boot1_DEFINE_flag_isMemberFunctionINSTANTIATED();
	stat_REG_boot2_SUBSTANTIATE_flag_isMemberFunctionINSTANTIATED();
	stat_REG_boot3_INITIALISE_flag_isMemberFunctionINSTANTIATED();
	stat_CLASS_get_ptr_Framework()->boot4_PGM_INSTANTIATION_WriteEnableForThreadsAt_CLIENTINPUTACTION_Framework(stat_CLASS_get_ptr_Framework());
	std::cout << "done Program - INSTANTIATION." << std::endl;
	
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
bool OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::CLIBWriteEnableForThreadsAtCLIENTINPUTACTION::app_FUNCT_get_flag_isPGM_INSTNATIATED()
{
	if (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[1] == false) {
		return stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[0];
	}
	else {
		stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[1] = false;
	}
}
void OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::CLIBWriteEnableForThreadsAtCLIENTINPUTACTION::app_FUNCT_terminate_Program()
{
	if (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[2] == false) {
		delete _ptr_Framework_WriteEnableForThreadsAt_CLIENTINPUTACTION;
		while (stat_CLASS_get_ptr_Framework() != NULL) {}
	}
	else {
		stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[2] = false;
	}
	
}
void OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::CLIBWriteEnableForThreadsAtCLIENTINPUTACTION::app_FUNCT_write_End(void* obj, unsigned char* bytes)
{
	if (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[3] == false) {
		OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::WriteEnableForThreadsAt_CLIENTINPUTACTION_Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_WriteEnable()->dyn_app_FUNCT_write_End(OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::WriteEnableForThreadsAt_CLIENTINPUTACTION_Global::stat_CONVERT_ObjPtr_to_Class(obj), OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::WriteEnableForThreadsAt_CLIENTINPUTACTION_Global::stat_CONVERT_ByteArray_to_uint8_t(bytes));
	}
	else {
		stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[3] = false;
	}
}
void OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::CLIBWriteEnableForThreadsAtCLIENTINPUTACTION::app_FUNCT_write_Start(void* obj, unsigned char* bytes)
{
	if (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[4] == false) {
		OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::WriteEnableForThreadsAt_CLIENTINPUTACTION_Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_WriteEnable()->dyn_app_FUNCT_write_Start(OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::WriteEnableForThreadsAt_CLIENTINPUTACTION_Global::stat_CONVERT_ObjPtr_to_Class(obj), OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::WriteEnableForThreadsAt_CLIENTINPUTACTION_Global::stat_CONVERT_ByteArray_to_uint8_t(bytes));
	}
	else {
		stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[4] = false;
		stat_app_FUNCT_Calc_IsAllINSTANTIATED();//INSTANTIATE this member function last.
	}
}
void OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::CLIBWriteEnableForThreadsAtCLIENTINPUTACTION::stat_app_FUNCT_Calc_IsAllINSTANTIATED()
{
	stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[0] = false;
	for (uint8_t memberFunctionId = 1; memberFunctionId < sizeof(*stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()); memberFunctionId++)
	{
		if (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[memberFunctionId] == true)
		{
			stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[0] = true;
		}
	}
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
void OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::CLIBWriteEnableForThreadsAtCLIENTINPUTACTION::stat_REG_boot1_DEFINE_flag_isMemberFunctionINSTANTIATED()
{
	_stat_REG_flag_isMemberFunctionINSTANTIATED = NULL;
}
void OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::CLIBWriteEnableForThreadsAtCLIENTINPUTACTION::stat_REG_boot2_SUBSTANTIATE_flag_isMemberFunctionINSTANTIATED()
{
	_stat_REG_flag_isMemberFunctionINSTANTIATED = new bool[5]();
	while (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED() == NULL) {}
	for (uint8_t index = 0; index < sizeof(*stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()); index++)
	{
		_stat_REG_flag_isMemberFunctionINSTANTIATED[index] = true;
	}
}
void OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::CLIBWriteEnableForThreadsAtCLIENTINPUTACTION::stat_REG_boot3_INITIALISE_flag_isMemberFunctionINSTANTIATED()
{
	for (uint8_t index = 0; index < sizeof(*stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()); index++)
	{
		_stat_REG_flag_isMemberFunctionINSTANTIATED[index] = true;
	}
}
bool* OpenAvrilCLIBWriteEnableForThreadsAtCLIENTINPUTACTION::CLIBWriteEnableForThreadsAtCLIENTINPUTACTION::stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()
{
	return _stat_REG_flag_isMemberFunctionINSTANTIATED;
}
````

#### LIB_WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE.dll.
##### Header.
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
			static bool app_FUNCT_get_flag_isPGM_INSTNATIATED();
			static void app_FUNCT_terminate_Program();
			static void app_FUNCT_write_End(void*, unsigned char* bytes);
			static void app_FUNCT_write_Start(void*, unsigned char* bytes);
		private:
			static bool* _stat_REG_flag_isMemberFunctionINSTANTIATIOND;
			static void stat_app_FUNCT_Calc_IsAllINSTANTIATED();
			static void stat_boot1_CLASS_DEFINE_Framework();
			static void stat_boot3_CLASS_INITIALISE_Framework();
			static class WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE_Framework* stat_CLASS_get_ptr_Framework();
			static void stat_REG_boot1_DEFINE_flag_isMemberFunctionINSTANTIATED();
			static void stat_REG_boot2_SUBSTANTIATE_flag_isMemberFunctionINSTANTIATED();
			static void stat_REG_boot3_INITIALISE_flag_isMemberFunctionINSTANTIATED();
			static bool* stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED();
		};
	}
}
````
##### Source.
````
#include "pch.h"
#include "framework.h"
#include "LIB_WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE.h"
class OpenAvrilCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE_Framework* _ptr_Framework_WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE;
bool* _stat_REG_flag_isMemberFunctionINSTANTIATED;
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

	std::cout << "started Program - INSTANTIATION." << std::endl;
	stat_CLASS_get_ptr_Framework()->boot4_PGM_INSTANTIATION_WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE_Framework(stat_CLASS_get_ptr_Framework());
	std::cout << "done Program - INSTANTIATION." << std::endl;
	
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
bool OpenAvrilCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::CLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::app_FUNCT_get_flag_isPGM_INSTNATIATED()
{
	if (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[1] == false) {
		return stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[0];
	}
	else {
		stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[1] = false;
	}
}

void OpenAvrilCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::CLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::app_FUNCT_terminate_Program()
{
	if (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[2] == false) {
		delete _ptr_Framework_WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE;
		while (stat_CLASS_get_ptr_Framework() != NULL) {}
	}
	else {
		stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[2] = false;
	}
}
void OpenAvrilCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::CLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::app_FUNCT_write_End(void* obj, unsigned char* bytes)
{
	if (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[3] == false) {
		OpenAvrilCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE_Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_WriteEnable()->dyn_app_FUNCT_write_End(OpenAvrilCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE_Global::stat_CONVERT_ObjPtr_to_Class(obj), OpenAvrilCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE_Global::stat_CONVERT_ByteArray_to_uint8_t(bytes));
	}
	else {
		stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[3] = false;
	}
}
void OpenAvrilCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::CLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::app_FUNCT_write_Start(void* obj, unsigned char* bytes)
{
	if (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[4] == false) {
		OpenAvrilCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE_Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_WriteEnable()->dyn_app_FUNCT_write_Start(OpenAvrilCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE_Global::stat_CONVERT_ObjPtr_to_Class(obj), OpenAvrilCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE_Global::stat_CONVERT_ByteArray_to_uint8_t(bytes));
	}
	else {
		stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[4] = false;
		stat_app_FUNCT_Calc_IsAllINSTANTIATED();//INSTANTIATE this member function last.
	}
}
void OpenAvrilCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::CLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::stat_app_FUNCT_Calc_IsAllINSTANTIATED()
{
	stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[0] = false;
	for (uint8_t memberFunctionId = 1; memberFunctionId < sizeof(*stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()); memberFunctionId++)
	{
		if (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[memberFunctionId] == true)
		{
			stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[0] = true;
		}
	}
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
void OpenAvrilCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::CLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::stat_REG_boot1_DEFINE_flag_isMemberFunctionINSTANTIATED()
{
	_stat_REG_flag_isMemberFunctionINSTANTIATED = NULL;
}
void OpenAvrilCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::CLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::stat_REG_boot2_SUBSTANTIATE_flag_isMemberFunctionINSTANTIATED()
{
	_stat_REG_flag_isMemberFunctionINSTANTIATED = new bool[5]();
	while (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED() == NULL) {}
	for (uint8_t index = 0; index < sizeof(*stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()); index++)
	{
		_stat_REG_flag_isMemberFunctionINSTANTIATED[index] = true;
	}
}
void OpenAvrilCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::CLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::stat_REG_boot3_INITIALISE_flag_isMemberFunctionINSTANTIATED()
{
	for (uint8_t index = 0; index < sizeof(*stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()); index++)
	{
		_stat_REG_flag_isMemberFunctionINSTANTIATED[index] = true;
	}
}
bool* OpenAvrilCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::CLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE::stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()
{
	return _stat_REG_flag_isMemberFunctionINSTANTIATED;
}
````

### Java Imports.
#### JavaLIBLaunchQue_Client.java.
````
package lib;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public interface JavaLIBLaunchQue_Client extends Library
{
    JavaLIBLaunchQue_Client INSTANCE = (JavaLIBLaunchQue_Client) Native.load("Assignment_1_-_the_dll", 	JavaLIBLaunchQue_Client.class);
    Pointer app_FUNCT_generate_Program();
    boolean app_FUNCT_get_flag_isPGM_INSTNATIATED();
    void app_FUNCT_request_Wait_launch(Pointer obj, byte[] bytes);
    void app_FUNCT_terminate_Progaram();
    void app_FUNCT_thread_End(Pointer obj, byte[] bytes);
    byte[] app_REG_get_coreId_To_launch(Pointer obj);
    boolean app_REG_get_Flag_Active(Pointer obj);
    boolean app_REG_get_Flag_ConcurrentCoreState(Pointer obj, byte[] bytes);
    boolean app_REG_get_Flag_Idle(Pointer obj);
    boolean app_REG_get_State_launchBit(Pointer obj);
    void app_REG_set_Flag_ConcurrentCoreState(Pointer obj, byte[] bytes, boolean newValue);
}
````

#### JavaLIBWriteQue_ClientInputSend.java.
````
package lib;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public interface JavaLIBWriteQue_ClientInputSend extends Library
{
    JavaLIBWriteQue_ClientInputSend INSTANCE = (JavaLIBWriteQue_ClientInputSend) Native.load("LIB_WriteEnableForThreadsAt_CLIENTINPUTACTION", JavaLIBWriteQue_ClientInputSend.class);
    Pointer app_FUNCT_generate_Program();
    boolean app_FUNCT_get_flag_isPGM_INSTNATIATED();
    void app_FUNCT_terminate_Program();
    void app_FUNCT_write_End(Pointer obj, byte[] bytes);
    void app_FUNCT_write_Start(Pointer obj, byte[] bytes);
}
````

#### JavaLIBWriteQue_ClientOutputRecieve.java.
````
package lib;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public interface JavaLIBWriteQue_ClientOutputRecieve extends Library
{
    JavaLIBWriteQue_ClientOutputRecieve INSTANCE = (JavaLIBWriteQue_ClientOutputRecieve) Native.load("LIB_WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE", JavaLIBWriteQue_ClientOutputRecieve.class);
    Pointer app_FUNCT_generate_Program();
    boolean app_FUNCT_get_flag_isPGM_INSTNATIATED();
    void app_FUNCT_terminate_Program();
    void app_FUNCT_write_End(Pointer obj, byte[] bytes);
    void app_FUNCT_write_Start(Pointer obj, byte[] bytes);
}
````

## Server.
### Native C++ Libraries.
#### LIB_LaunchEnableForConcurrentThreadsAt_SERVER.dll.
##### Header.
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
##### Source.
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

#### LIB_WriteEnableForThreadsAt_SERVERINPUTACTION.dll.
##### Header.
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
##### Source.
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

#### LIB_WriteEnableForThreadsAt_SERVEROUTPUTRECIEVE.dll.
##### Header.
````

````
#### Source.
````

````

#### LIB_OpenAvrilConcurrent_IO_Server.dll.
##### Header.
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
			static bool app_FUNCT_get_flag_isPGM_INSTNATIATED();
			static void app_FUNCT_select_set_Intput_Subset(void* obj, unsigned char* bytes);
			static void app_FUNCT_terminate_Program();
			static void app_FUNCT_pop_From_Stack_Of_Output(void* obj);
			static void app_FUNCT_push_To_STACK_Of_Input(void* obj);
			static unsigned char* dyn_REG_get_flag_isStackLoaded_Server_InputAction(void* obj);
			static unsigned char* dyn_REG_get_flag_isStackLoaded_Server_OutputSend(void* obj);
			static unsigned char* dyn_REG_get_flag_IsInitialised_OpenAvrilConcurrency(void* obj);
			static unsigned char* dyn_REG_get_ptr_PraiseEventId(void* obj);
			static unsigned char* dyn_REG_get_ptr_Output_praise0_Value(void* obj);
			static void dyn_REG_set_Item_Input_praise0_Value_A(void* obj, unsigned char* bytes);
			static void dyn_REG_set_Item_Input_praise0_Value_B(void* obj, unsigned char* bytes);
			static void dyn_REG_set_PraiseEventId(void* obj, unsigned char* bytes);
			static void* dyn_PGM_get_program_WriteEnableStack_ServerInputAction(void* obj);
			static void* dyn_PGM_get_program_WriteEnableStack_ServerOutputRecieve(void* obj);
		private:
			static bool* _stat_REG_flag_isMemberFunctionINSTANTIATIOND;
			static void stat_app_FUNCT_Calc_IsAllINSTANTIATED();
			static void stat_CLASS_boot1_DEFINE_Framework();
			static void stat_CLASS_boot3_INITIALISE_Framework();
			static void* stat_CLASS_get_ptr_Framework_Server();
			static void stat_REG_boot1_DEFINE_flag_isMemberFunctionINSTANTIATED();
			static void stat_REG_boot2_SUBSTANTIATE_flag_isMemberFunctionINSTANTIATED();
			static void stat_REG_boot3_INITIALISE_flag_isMemberFunctionINSTANTIATED();
			static bool* stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED();
		};
	}
}
````
##### Source.
````
#include "pch.h"
#include "framework.h"
#include "LIB_Concurrent_IO_Server.h"
	static void* _CLASS_ptr_Framework_Server;
	bool* _stat_REG_flag_isMemberFunctionINSTANTIATED;
// public.
	void OpenAvrilConcurrency::CLIBConcurrentServerIO::app_FUNCT_flip_Input_DoubleBuffer(void* obj)
	{
		if (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[1] == false) {
			OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_Server()->dyn_CLASS_get_ptr_Data()->dyn_CLASS_get_ptr_Data_Control()->app_FUNCT_flip_Input_DoubleBuffer();
		}
		else {
			stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[1] = false;
			stat_app_FUNCT_Calc_IsAllINSTANTIATED();//INSTANTIATE this member function last.
		}
	}
	void* OpenAvrilConcurrency::CLIBConcurrentServerIO::app_FUNCT_generate_Program()
	{
		std::cout << "entered app_FUNCT_generate_Program()." << std::endl;

		std::cout << "started CLASS(s) - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE." << std::endl;
		stat_CLASS_boot1_DEFINE_Framework();
		stat_CLASS_boot3_INITIALISE_Framework();
		std::cout << "done CLASS(s) - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE." << std::endl;

		std::cout << "started STRUCT(s) - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE." << std::endl;
		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->stat_STRUCT_boot0_DECLAIRE();
		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->stat_STRUCT_boot1_DEFINE();
		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->stat_STRUCT_boot3_INITIALISE();
		
		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->dyn_STRUCT_get_User_Input()->dyn_REG_boot1_DEFINE_User_Input();
		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->dyn_STRUCT_get_User_Input()->dyn_REG_boot2_SUBSTANTIATE_User_Input();
		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->dyn_STRUCT_get_User_Input()->dyn_REG_boot3_INITIALISE_User_Input();
		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->dyn_STRUCT_get_User_Input()->dyn_REG_boot4_INSTANTIATE_User_Input();

		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->dyn_STRUCT_get_User_Output()->dyn_REG_boot1_DEFINE_User_Output();
		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->dyn_STRUCT_get_User_Output()->dyn_REG_boot2_SUBSTANTIATE_User_Output();
		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->dyn_STRUCT_get_User_Output()->dyn_REG_boot3_INITIALISE_User_Output();
		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->dyn_STRUCT_get_User_Output()->dyn_REG_boot4_INSTANTIATE_User_Output();

		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->dyn_STRUCT_get_User_Algorithim()->dyn_REG_boot1_DEFINE_User_Algorithim();
		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->dyn_STRUCT_get_User_Algorithim()->dyn_REG_boot2_SUBSTANTIATE_User_Algorithim();
		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->dyn_STRUCT_get_User_Algorithim()->dyn_REG_boot3_INITIALISE_User_Algorithim();
		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->dyn_STRUCT_get_User_Algorithim()->dyn_REG_boot4_INSTANTIATE_User_Algorithim();

		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->dyn_STRUCT_get_Input()->dyn_REG_boot1_DEFINE_Input();
		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->dyn_STRUCT_get_Input()->dyn_REG_boot2_SUBSTANTIATE_Input();
		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->dyn_STRUCT_get_Input()->dyn_REG_boot3_INITIALISE_Input(OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server()));
		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->dyn_STRUCT_get_Input()->dyn_REG_boot4_INSTANTIATE_Input();
		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->dyn_STRUCT_get_Input()->dyn_CLASS_get_ptr_Input_Control()->app_select_And_Set_Input_Subset(OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server()), (uint8_t)(0));

		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->dyn_STRUCT_get_Output()->dyn_REG_boot1_DEFINE_Output();
		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->dyn_STRUCT_get_Output()->dyn_REG_boot2_SUBSTANTIATE_Output();
		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->dyn_STRUCT_get_Output()->dyn_REG_boot3_INITIALISE_Output(OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server()));
		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->dyn_STRUCT_get_Output()->dyn_REG_boot4_INSTANTIATE_Output();
		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->dyn_STRUCT_get_Output()->dyn_CLASS_get_ptr_Output_Control()->app_select_And_Set_Output_Subset(OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server()), (uint8_t)(0));

		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->dyn_STRUCT_get_Concurrent()->dyn_REG_boot1_DEFINE_Concurrent();
		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->dyn_STRUCT_get_Concurrent()->dyn_REG_boot2_SUBSTANTIATE_Concurrent();
		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->dyn_STRUCT_get_Concurrent()->dyn_REG_boot3_INITIALISE_Concurrent(OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server()));
		OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->dyn_STRUCT_get_Concurrent()->dyn_REG_boot4_INSTANTIATE_Concurrent();
		for (uint8_t concurrentThreadId = 0; concurrentThreadId < (OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->dyn_CLASS_get_ptr_Server()->dyn_CLASS_get_ptr_Global()->dyn_REG_get_Item_number_Of_Implemented_Cores() -1); concurrentThreadId++)
		{
			OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server())->dyn_CLASS_get_ptr_Server()->dyn_CLASS_get_ptr_Algorithms()->dyn_STRUCT_get_Item_On_list_Of_ptr_Concurrent(concurrentThreadId)->dyn_CLASS_get_ptr_Concurrent_Control()->app_selectset_Algorithm_Scubset(OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(stat_CLASS_get_ptr_Framework_Server()), (uint8_t)(0), concurrentThreadId);
		}
		std::cout << "done STRUCT(s) - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE." << std::endl;

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
	bool OpenAvrilConcurrency::CLIBConcurrentServerIO::app_FUNCT_get_flag_isPGM_INSTNATIATED()
	{
		if (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[2] == false) {
			return stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[0];
		}
		else {
			stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[2] = false;
		}
		return true;
	}
	void OpenAvrilConcurrency::CLIBConcurrentServerIO::app_FUNCT_select_set_Intput_Subset(void* obj, unsigned char* bytes)
	{
		if (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[3] == false) {
			OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_Server()->dyn_CLASS_get_ptr_Data()->dyn_REG_get_ptr_Item_array_Of_doubleBuffer_Input_WRITE(OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj))->dyn_CLASS_get_ptr_Input_Control()->app_select_And_Set_Input_Subset(OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj), OpenAvrilConcurrency::Global::stat_CONVERT_ByteArray_to_uint8_t(bytes));
		}
		else {
			stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[3] = false;
			stat_app_FUNCT_Calc_IsAllINSTANTIATED();
		}
	}
	void OpenAvrilConcurrency::CLIBConcurrentServerIO::app_FUNCT_terminate_Program()
	{
		if (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[4] == false) {
			delete _CLASS_ptr_Framework_Server;
			while (stat_CLASS_get_ptr_Framework_Server() != NULL) { }
		}
		else {
			stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[4] = false;
			stat_app_FUNCT_Calc_IsAllINSTANTIATED();
		}
	}
	void OpenAvrilConcurrency::CLIBConcurrentServerIO::app_FUNCT_pop_From_Stack_Of_Output(void* obj)
	{
		if (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[5] == false) {
			OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_Server()->dyn_CLASS_get_ptr_Data()->dyn_CLASS_get_ptr_Data_Control()->app_FUNCT_pop_From_Stack_Of_Output(OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj));
		}
		else {
			stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[5] = false;
			stat_app_FUNCT_Calc_IsAllINSTANTIATED();
		}
	}
	void OpenAvrilConcurrency::CLIBConcurrentServerIO::app_FUNCT_push_To_STACK_Of_Input(void* obj)
	{
		if (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[6] == false) {
			OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_Server()->dyn_CLASS_get_ptr_Data()->dyn_CLASS_get_ptr_Data_Control()->app_FUNCT_push_To_STACK_Of_Input(OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj));
		}
		else {
			stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[6] = false;
			stat_app_FUNCT_Calc_IsAllINSTANTIATED();
		}
	}
	unsigned char* OpenAvrilConcurrency::CLIBConcurrentServerIO::dyn_REG_get_flag_isStackLoaded_Server_InputAction(void* obj)
	{
		if (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[7] == false) {
			return OpenAvrilConcurrency::Global::stat_CONVERT_bool_to_ByteArray(OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_Server()->dyn_CLASS_get_ptr_Data()->dyn_CLASS_get_ptr_Data_Control()->dyn_REG_get_Item_flag_isLoaded_Stack_InputAction());
		}
		else {
			stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[7] = false;
			stat_app_FUNCT_Calc_IsAllINSTANTIATED();
		}
		return OpenAvrilConcurrency::Global::stat_CONVERT_bool_to_ByteArray(true);
		
	}
	unsigned char* OpenAvrilConcurrency::CLIBConcurrentServerIO::dyn_REG_get_flag_isStackLoaded_Server_OutputSend(void* obj)
	{
		if (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[8] == false) {
			return OpenAvrilConcurrency::Global::stat_CONVERT_bool_to_ByteArray(OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_Server()->dyn_CLASS_get_ptr_Data()->dyn_CLASS_get_ptr_Data_Control()->dyn_REG_get_Item_flag_isLoaded_Stack_OutputSend());
		}
		else {
			stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[8] = false;
			stat_app_FUNCT_Calc_IsAllINSTANTIATED();
		}
		return OpenAvrilConcurrency::Global::stat_CONVERT_bool_to_ByteArray(true);
	}
	unsigned char* OpenAvrilConcurrency::CLIBConcurrentServerIO::dyn_REG_get_flag_IsInitialised_OpenAvrilConcurrency(void* obj)
	{
		if (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[9] == false) {
			return OpenAvrilConcurrency::Global::stat_CONVERT_bool_to_ByteArray(OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_Server()->dyn_CLASS_get_ptr_Execute()->dyn_CLASS_get_ptr_Execute_Control()->dyn_REG_get_Flag_is_SystemInitialised());
		}
		else {
			stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[9] = false;
			stat_app_FUNCT_Calc_IsAllINSTANTIATED();
		}
		return OpenAvrilConcurrency::Global::stat_CONVERT_bool_to_ByteArray(true);
	}
	unsigned char* OpenAvrilConcurrency::CLIBConcurrentServerIO::dyn_REG_get_ptr_PraiseEventId(void* obj)
	{
		if (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[10] == false) {
			return OpenAvrilConcurrency::Global::stat_CONVERT_uint8_t_to_ByteArray(OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_Server()->dyn_CLASS_get_ptr_Data()->dyn_REG_get_ptr_Item_array_Of_doubleBuffer_Output_WRITE(OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj))->dyn_REG_get_ptr_Output_praiseEventId());
		}
		else {
			stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[10] = false;
			stat_app_FUNCT_Calc_IsAllINSTANTIATED();
		}
		return OpenAvrilConcurrency::Global::stat_CONVERT_uint8_t_to_ByteArray(uint8_t(UINT8_MAX));
	}
	unsigned char* OpenAvrilConcurrency::CLIBConcurrentServerIO::dyn_REG_get_ptr_Output_praise0_Value(void* obj)
	{
		if (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[11] == false) {
			OpenAvrilConcurrency::Output_praise0* objOutput_praise0 = (OpenAvrilConcurrency::Output_praise0*)OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_Server()->dyn_CLASS_get_ptr_Data()->dyn_REG_get_ptr_Item_array_Of_doubleBuffer_Output_READ(OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj))->dyn_REG_get_ptr_Item_Of_ptr_Outputs_Subset();
			return OpenAvrilConcurrency::Global::stat_CONVERT_Double_to_ByteArray(objOutput_praise0->dyn_REG_get_output_Value());
			delete objOutput_praise0;
		}
		else {
			stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[11] = false;
			stat_app_FUNCT_Calc_IsAllINSTANTIATED();
		}
		return OpenAvrilConcurrency::Global::stat_CONVERT_Double_to_ByteArray(DBL_MAX);;
	}
	void OpenAvrilConcurrency::CLIBConcurrentServerIO::dyn_REG_set_Item_Input_praise0_Value_A(void* obj, unsigned char* bytes)
	{
		if (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[12] == false) {
			OpenAvrilConcurrency::Input_praise0* objInput_praise0 = (OpenAvrilConcurrency::Input_praise0*)OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_Server()->dyn_CLASS_get_ptr_Data()->dyn_REG_get_ptr_Item_array_Of_doubleBuffer_Input_WRITE(OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj));
			objInput_praise0->dyn_REG_set_Item_Input_praise0_valueA(OpenAvrilConcurrency::Global::stat_CONVERT_ByteArray_to_Float(bytes));
			delete objInput_praise0;
		}
		else {
			stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[12] = false;
			stat_app_FUNCT_Calc_IsAllINSTANTIATED();
		}
	}
	void OpenAvrilConcurrency::CLIBConcurrentServerIO::dyn_REG_set_Item_Input_praise0_Value_B(void* obj, unsigned char* bytes)
	{
		if (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[13] == false) {
			OpenAvrilConcurrency::Input_praise0* objInput_praise0 = (OpenAvrilConcurrency::Input_praise0*)OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_Server()->dyn_CLASS_get_ptr_Data()->dyn_REG_get_ptr_Item_array_Of_doubleBuffer_Input_WRITE(OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj))->dyn_REG_get_ptr_Input_praiseEventId();
			objInput_praise0->dyn_REG_set_Item_Input_praise0_valueB(OpenAvrilConcurrency::Global::stat_CONVERT_ByteArray_to_Float(bytes));
			delete objInput_praise0;
		}
		else {
			stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[13] = false;
			stat_app_FUNCT_Calc_IsAllINSTANTIATED();
		}
	}
	void OpenAvrilConcurrency::CLIBConcurrentServerIO::dyn_REG_set_PraiseEventId(void* obj, unsigned char* bytes)
	{
		if (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[14] == false) {
			OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_Server()->dyn_CLASS_get_ptr_Data()->dyn_REG_get_ptr_Item_array_Of_doubleBuffer_Input_WRITE(OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj))->dyn_REG_set_ptr_Input_praiseEventId(OpenAvrilConcurrency::Global::stat_CONVERT_ByteArray_to_uint8_t(bytes));
		}
		else {
			stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[14] = false;
			stat_app_FUNCT_Calc_IsAllINSTANTIATED();
		}
	}
	void* OpenAvrilConcurrency::CLIBConcurrentServerIO::dyn_PGM_get_program_WriteEnableStack_ServerInputAction(void* obj)
	{
		if (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[15] == false) {
			return OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_Server()->dyn_CLASS_get_ptr_Execute()->dyn_PGM_get_WriteEnable_ServerInputAction();
		}
		else {
			stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[15] = false;
			stat_app_FUNCT_Calc_IsAllINSTANTIATED();
		}
		return (void*)(NULL);
	}
	void* OpenAvrilConcurrency::CLIBConcurrentServerIO::dyn_PGM_get_program_WriteEnableStack_ServerOutputRecieve(void* obj)
	{
		if (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[16] == false) {
			return OpenAvrilConcurrency::Global::stat_CONVERT_ObjPtr_to_Class(obj)->dyn_CLASS_get_ptr_Server()->dyn_CLASS_get_ptr_Execute()->dyn_PGM_get_WriteEnable_ServerOutputRecieve();
		}
		else {
			stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[16] = false;
			stat_app_FUNCT_Calc_IsAllINSTANTIATED();
		}
		return (void*)(NULL);
	}
	void OpenAvrilConcurrency::CLIBConcurrentServerIO::stat_app_FUNCT_Calc_IsAllINSTANTIATED()
	{
		stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[0] = false;
		for (uint8_t memberFunctionId = 1; memberFunctionId < sizeof(*stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()); memberFunctionId++)
		{
			if (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[memberFunctionId] == true)
			{
				stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()[0] = true;
			}
		}
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
	void OpenAvrilConcurrency::CLIBConcurrentServerIO::stat_REG_boot1_DEFINE_flag_isMemberFunctionINSTANTIATED()
	{
		_stat_REG_flag_isMemberFunctionINSTANTIATED = NULL;
	}
	void OpenAvrilConcurrency::CLIBConcurrentServerIO::stat_REG_boot2_SUBSTANTIATE_flag_isMemberFunctionINSTANTIATED()
	{
		_stat_REG_flag_isMemberFunctionINSTANTIATED = new bool[17]();
		while (stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED() == NULL) {}
		for (uint8_t index = 0; index < sizeof(*stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()); index++)
		{
			_stat_REG_flag_isMemberFunctionINSTANTIATED[index] = true;
		}
	}
	void OpenAvrilConcurrency::CLIBConcurrentServerIO::stat_REG_boot3_INITIALISE_flag_isMemberFunctionINSTANTIATED()
	{
		for (uint8_t index = 0; index < sizeof(*stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()); index++)
		{
			_stat_REG_flag_isMemberFunctionINSTANTIATED[index] = true;
		}
	}
	bool* OpenAvrilConcurrency::CLIBConcurrentServerIO::stat_REG_get_ptr_flag_isMemberFunctionINSTANTIATED()
	{
		return _stat_REG_flag_isMemberFunctionINSTANTIATED;
	}

````

### Java Imports.
#### JavaLIBConcurrentIOServer.java.
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
    byte[] app_FUNCT_get_flag_isPGM_INSTNATIATED();
    void app_FUNCT_select_set_Intput_Subset(Pointer obj, byte[] bytes);
    void app_FUNCT_terminate_Program();
    void app_FUNCT_pop_From_Stack_Of_Output(Pointer obj);
    void app_FUNCT_push_To_STACK_Of_Input(Pointer obj);
    byte[] dyn_REG_get_flag_isStackLoaded_Server_InputAction(Pointer obj);
    byte[] dyn_REG_get_flag_isStackLoaded_Server_OutputSend(Pointer obj);
    byte[] dyn_REG_get_flag_IsInitialised_OpenAvrilConcurrency(Pointer obj);
    byte[] dyn_REG_get_ptr_PraiseEventId(Pointer obj);
    byte[] dyn_REG_get_ptr_Output_praise0_Value(Pointer obj);
    void dyn_REG_set_Item_Input_praise0_Value_A(Pointer obj, byte[] bytes);
    void dyn_REG_set_Item_Input_praise0_Value_B(Pointer obj, byte[] bytes);
    void dyn_REG_set_PraiseEventId(Pointer obj, byte[] bytes);
    Pointer dyn_PGM_get_program_WriteEnableStack_ServerInputAction(Pointer obj);
    Pointer dyn_PGM_get_program_WriteEnableStack_ServerOutputRecieve(Pointer obj);
}
````

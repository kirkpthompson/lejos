#ifndef MAIN_H
#define MAIN_H
extern unsigned int gNextProgramSize;
extern byte *gNextProgram;
extern unsigned int gProgramExecutions;

extern int run_program(byte *start, int len);
extern void shutdown();
extern void firmware_exception_handler(Throwable *exception, int method, int pc);
#endif

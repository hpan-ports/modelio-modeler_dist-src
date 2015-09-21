#!/bin/bash
###########################################################################
#    Modelio launcher
#
# Parameters available:
#  -nl en/fr              : define the user interface language
#  -clean                 : Clean the cached data.
#  -workspace dir_path    : Open th modelio session which using the
#                           "dir_path" directory as workspace data.
#  -project  proj_name    : Open directly the project_name with modelio
#  -create proj_name      : Create a new project named proj_name
#  -batch script_name.py  : Execute a Jython script
#  -param key=val         : Set the key variable with the val value.
#                           This variable is available in jython script.
#
###########################################################################

main()
{
	MODELIO_PATH="`getModelioInstallPath $0`"
	SWT_GTK3=0
	UBUNTU_MENUPROXY=0
	LIBOVERLAY_SCROLLBAR=0
	GDK_NATIVE_WINDOWS=1
	PATH=${PATH}:"${MODELIO_PATH}"
	export SWT_GTK3 UBUNTU_MENUPROXY LIBOVERLAY_SCROLLBAR GDK_NATIVE_WINDOWS PATH

	####
	# Run
	"${MODELIO_PATH}/modelio" $*
}

getModelioInstallPath()
{
	if [ -L "$0" ] ; then
		SLNK=$(\ls -l "$0"| sed -e "s|.* -> ||")
		if [ "${SLNK:0:1}" != "/" ] ; then
			FILE_PATH="$(dirname $0)/$SLNK"
		else
			FILE_PATH="$SLNK"
		fi
	else
		FILE_PATH="$0"
	fi
	FULL_PATH=$(cd -P -- "$(dirname -- "$FILE_PATH")" && printf '%s\n' "$(pwd -P)/${FILE_PATH##*/}")
	echo $(dirname "${FULL_PATH}")
}

main $*


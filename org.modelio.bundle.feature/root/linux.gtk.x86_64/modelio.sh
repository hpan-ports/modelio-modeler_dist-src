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
#  -bash script_name.py : Execute a Jython script
#
###########################################################################

main()
{
	export MODELIO_PATH="`getModelioInstallPath $0`"
	export PATH=${PATH}:"${MODELIO_PATH}"
	export SWT_GTK3=0
	export UBUNTU_MENUPROXY=0
	
	####
	# Use Xulrunner if it is present in bundle directory.
	xulpath=`getXulrunnerInstallPath "${MODELIO_PATH}"`
	if [ -n "${xulpath}" ] ; then
		export GRE_HOME="${xulpath}"
		export MOZILLA_FIVE_HOME="${GRE_HOME}"
		export LD_LIBRARY_PATH="${GRE_HOME}":${LD_LIBRARY_PATH}
	else
		unset MOZILLA_FIVE_HOME
		unset GRE_HOME
	fi

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

getXulrunnerInstallPath()
{
	mpath="$1"
	xulrunner_path="${mpath}/bundle/xulrunner"
	if [ -x "${xulrunner_path}/xulrunner-bin" ] ; then
		echo "${xulrunner_path}"
	else
		echo ""
	fi
}

main $*

from numpy import rec


def sol(recording):
    recording = [x.lower() for x in recording]
    n = len(recording)
    if(n<2):
        return 0
    j = 0
    for i in range(n):
        if (recording[j] != recording[i]):
            j += 1
            recording[j] = recording[i]
    j += 1
    recording = recording[:j]
    return(len(recording) - 1)
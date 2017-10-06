using System.Collections.Generic;
using GoogleMobileAds.Api.Mediation;

namespace NendMediationExtras
{
	public class NendNormalMediationExtras : MediationExtras {

		private const string interstitialTypeNormal = "interstitialTypeNormal";
		public const string interstitialTypeVideo = "interstitialTypeVideo";

		public NendNormalMediationExtras()
		{
			this.Extras = new Dictionary<string, string> ();
		}

		public string InterstitialType
		{
			set 
			{ 
				this.Extras.Add("type", value);
			}
		}

		public string UserId
		{
			set 
			{ 
				this.Extras.Add("userId", value);
			}
		}

		public override string IOSMediationExtraBuilderClassName
		{
			get
			{
				return "GADMUAdapterNendMediationExtras";
			}
		}

		public override string AndroidMediationExtraBuilderClassName
		{
			get
			{
				return "net.nend.android.unityextramediation.GADMUAdapterNendMediationExtras";
			}
		}
	}
}

